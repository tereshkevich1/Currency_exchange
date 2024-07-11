package com.example.kursinfo.domain.use_case

import com.example.kursinfo.domain.repository.ExchangeRateRepository
import javax.inject.Inject

class GetCurrencyExchangeRate @Inject constructor(private val repository: ExchangeRateRepository) {
    suspend operator fun invoke(city: String) = repository.getCurrencyExchangeByCity(city)
}