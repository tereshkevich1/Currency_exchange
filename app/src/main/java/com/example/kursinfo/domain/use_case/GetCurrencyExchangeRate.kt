package com.example.kursinfo.domain.use_case

import com.example.kursinfo.data.remote.util.NetworkResult
import com.example.kursinfo.domain.model.CurrencyExchangeRate
import com.example.kursinfo.domain.model.toCurrencyExchangeRate
import com.example.kursinfo.domain.repository.ExchangeRateRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetCurrencyExchangeRate @Inject constructor(private val repository: ExchangeRateRepository) {
    suspend operator fun invoke(city: String): Flow<NetworkResult<List<CurrencyExchangeRate>>> =
        flow {
            when (val result = repository.getCurrencyExchangeByCity(city)) {
                is NetworkResult.Success -> {
                    emit(NetworkResult.Success(result.data.map { it.toCurrencyExchangeRate() }))
                }

                is NetworkResult.Error -> {
                    emit(NetworkResult.Error(result.code, result.message))
                }

                is NetworkResult.Exception -> {
                    emit(NetworkResult.Exception(result.e))
                }
            }
        }.flowOn(Dispatchers.IO)
}