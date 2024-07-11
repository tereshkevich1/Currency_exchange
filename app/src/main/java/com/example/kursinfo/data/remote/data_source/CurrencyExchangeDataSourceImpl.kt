package com.example.kursinfo.data.remote.data_source

import com.example.kursinfo.data.remote.api.CurrencyExchangeApi
import com.example.kursinfo.data.util.handleApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyExchangeDataSourceImpl @Inject constructor(
    private val api: CurrencyExchangeApi
) : CurrencyExchangeDataSource {
    override suspend fun fetchCurrencyExchangeByCity(city: String) = withContext(Dispatchers.IO) {
        handleApi { api.getCurrencyExchangeByCity(city) }
    }
}

