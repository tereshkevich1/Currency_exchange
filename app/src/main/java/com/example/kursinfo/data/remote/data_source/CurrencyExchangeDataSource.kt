package com.example.kursinfo.data.remote.data_source

import com.example.kursinfo.data.remote.dto.CurrencyExchangeRateDto
import com.example.kursinfo.data.util.NetworkResult

interface CurrencyExchangeDataSource {
    suspend fun fetchCurrencyExchangeByCity(city: String): NetworkResult<List<CurrencyExchangeRateDto>>
}
