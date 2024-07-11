package com.example.kursinfo.data.repository

import com.example.kursinfo.data.remote.data_source.CurrencyExchangeDataSource
import com.example.kursinfo.data.remote.dto.CurrencyExchangeRateDto
import com.example.kursinfo.data.util.NetworkResult
import com.example.kursinfo.domain.repository.ExchangeRateRepository
import javax.inject.Inject

class ExchangeRateRepositoryImpl @Inject constructor(private val currencyExchangeDataSource: CurrencyExchangeDataSource) :
    ExchangeRateRepository {
    override suspend fun getCurrencyExchangeByCity(city: String): NetworkResult<List<CurrencyExchangeRateDto>> {
        return currencyExchangeDataSource.fetchCurrencyExchangeByCity(city)
    }
}