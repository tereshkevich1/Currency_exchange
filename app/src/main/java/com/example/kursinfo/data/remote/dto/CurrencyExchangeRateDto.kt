package com.example.kursinfo.data.remote.dto

import com.google.gson.annotations.SerializedName

data class CurrencyExchangeRateDto(
    @SerializedName("CAD_in")
    val cadIn: String,
    @SerializedName("CAD_out")
    val cadOut: String,
    @SerializedName("CHF_in")
    val chfIn: String,
    @SerializedName("CHF_out")
    val chfOut: String,
    @SerializedName("CNY_EUR_in")
    val cnyEurIn: String,
    @SerializedName("CNY_EUR_out")
    val cnyEurOut: String,
    @SerializedName("CNY_RUB_in")
    val cnyRubIn: String,
    @SerializedName("CNY_RUB_out")
    val cnyRubOut: String,
    @SerializedName("CNY_USD_in")
    val cnyUsdIn: String,
    @SerializedName("CNY_USD_out")
    val cnyUsdOut: String,
    @SerializedName("CNY_in")
    val cnyIn: String,
    @SerializedName("CNY_out")
    val cnyOut: String,
    @SerializedName("CZK_in")
    val czkIn: String,
    @SerializedName("CZK_out")
    val czkOut: String,
    @SerializedName("EUR_in")
    val eurIn: String,
    @SerializedName("EUR_out")
    val eurOut: String,
    @SerializedName("GBP_in")
    val gbpIn: String,
    @SerializedName("GBP_out")
    val gbpOut: String,
    @SerializedName("JPY_in")
    val jpyIn: String,
    @SerializedName("JPY_out")
    val jpyOut: String,
    @SerializedName("NOK_in")
    val nokIn: String,
    @SerializedName("NOK_out")
    val nokOut: String,
    @SerializedName("PLN_in")
    val plnIn: String,
    @SerializedName("PLN_out")
    val plnOut: String,
    @SerializedName("RUB_EUR_in")
    val rubEurIn: String,
    @SerializedName("RUB_EUR_out")
    val rubEurOut: String,
    @SerializedName("RUB_in")
    val rubIn: String,
    @SerializedName("RUB_out")
    val rubOut: String,
    @SerializedName("SEK_in")
    val sekIn: String,
    @SerializedName("SEK_out")
    val sekOut: String,
    @SerializedName("USD_EUR_in")
    val usdEurIn: String,
    @SerializedName("USD_EUR_out")
    val usdEurOut: String,
    @SerializedName("USD_RUB_in")
    val usdRubIn: String,
    @SerializedName("USD_RUB_out")
    val usdRubOut: String,
    @SerializedName("USD_in")
    val usdIn: String,
    @SerializedName("USD_out")
    val usdOut: String,
    @SerializedName("filial_id")
    val filialId: String,
    @SerializedName("filials_text")
    val filialsText: String,
    @SerializedName("home_number")
    val homeNumber: String,
    @SerializedName("info_worktime")
    val infoWorkTime: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_type")
    val nameType: String,
    @SerializedName("sap_id")
    val sapId: String,
    @SerializedName("street")
    val street: String,
    @SerializedName("street_type")
    val streetType: String
)

