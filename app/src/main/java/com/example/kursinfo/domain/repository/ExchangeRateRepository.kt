package com.example.kursinfo.domain.repository

import com.example.kursinfo.data.remote.dto.CurrencyExchangeRateDto
import com.example.kursinfo.data.util.NetworkResult

interface ExchangeRateRepository {
    suspend fun getCurrencyExchangeByCity(city: String): NetworkResult<List<CurrencyExchangeRateDto>>
}