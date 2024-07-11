package com.example.kursinfo.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kursinfo.data.util.NetworkResult
import com.example.kursinfo.domain.model.toCurrencyExchangeRate
import com.example.kursinfo.domain.use_case.GetCurrencyExchangeRate
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getCurrencyExchangeRate: GetCurrencyExchangeRate): ViewModel() {
    val date = mutableStateOf("")
    init {
        viewModelScope.launch {
            when (val response = getCurrencyExchangeRate.invoke("kk")) {
                is NetworkResult.Success -> {
                    val currencyExchangeRateDtoList = response.data
                    val currencyExchangeRateList = currencyExchangeRateDtoList.map { it.toCurrencyExchangeRate() }
                    date.value = currencyExchangeRateList[0].toString()

                }
                is NetworkResult.Error -> date.value = response.message.toString()
                is NetworkResult.Exception -> date.value = response.e.message.toString()
            }
        }
    }
}