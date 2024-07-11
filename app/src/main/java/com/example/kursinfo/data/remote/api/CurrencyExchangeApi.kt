package com.example.kursinfo.data.remote.api

import com.example.kursinfo.data.remote.dto.CurrencyExchangeRateDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyExchangeApi {
    @GET("kursExchange")
    suspend fun getCurrencyExchangeByCity(@Query("city") city: String): Response<List<CurrencyExchangeRateDto>>
}