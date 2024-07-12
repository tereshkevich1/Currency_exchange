package com.example.kursinfo.domain.model

import com.example.kursinfo.data.remote.dto.CurrencyExchangeRateDto

data class CurrencyExchangeRate(
    val usdBuy: String,
    val usdSell: String,
    val eurBuy: String,
    val eurSell: String,
    val rubBuy: String,
    val rubSell: String,
    val city: String,
    val street: String,
    val streetType: String,
    val homeNumber: String,
    val filialsText: String
)

fun CurrencyExchangeRateDto.toCurrencyExchangeRate(): CurrencyExchangeRate {
    return CurrencyExchangeRate(
        usdBuy = usdIn,
        usdSell = usdOut,
        eurBuy = eurIn,
        eurSell = eurOut,
        rubBuy = rubIn,
        rubSell = rubOut,
        city = name,
        street = street,
        streetType = streetType,
        homeNumber = homeNumber,
        filialsText = filialsText
    )
}