package com.example.kursinfo.presentation.home_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kursinfo.data.remote.util.NetworkResult
import com.example.kursinfo.domain.model.CurrencyExchangeRate
import com.example.kursinfo.domain.use_case.GetCurrencyExchangeRate
import com.example.kursinfo.presentation.home_screen.util.ScreenUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val getCurrencyExchangeRate: GetCurrencyExchangeRate) :
    ViewModel() {
    private val _uiState =
        MutableStateFlow<ScreenUiState<List<CurrencyExchangeRate>>>(ScreenUiState.Empty)
    val uiState = _uiState.asStateFlow()

    val cityList = listOf("Брест", "Витебск", "Гомель", "Гродно", "Минск", "Могилёв")
    var selectedText by mutableStateOf(cityList[0])

    fun fetchCurrencyExchangeRates(city: String) {
        _uiState.value = ScreenUiState.Loading

        viewModelScope.launch {
            getCurrencyExchangeRate(city)
                .collect { result ->
                    when (result) {
                        is NetworkResult.Success -> {
                            _uiState.value = ScreenUiState.Success(result.data)
                        }

                        is NetworkResult.Error -> {
                            _uiState.value = ScreenUiState.Error(result.message ?: "Unknown Error")
                        }

                        is NetworkResult.Exception -> {
                            _uiState.value =
                                ScreenUiState.Error(result.e.message ?: "Unknown Error")
                        }
                    }
                }
        }
    }
}