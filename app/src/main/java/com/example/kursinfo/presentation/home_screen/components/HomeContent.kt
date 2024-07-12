package com.example.kursinfo.presentation.home_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.example.kursinfo.domain.model.CurrencyExchangeRate
import com.example.kursinfo.presentation.home_screen.util.ScreenUiState

@Composable
fun HomeContent(
    uiState: ScreenUiState<List<CurrencyExchangeRate>>,
    cityList: List<String>,
    selectedText: String,
    onCitySelected: (String) -> Unit,
    onFetchClicked: () -> Unit,
    innerPadding: Dp
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = innerPadding),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            SelectionSection(
                cityList = cityList,
                selectedText = selectedText,
                onCitySelected = onCitySelected,
                onFetchClicked = onFetchClicked
            )
        }

        when (uiState) {
            is ScreenUiState.Loading -> {
                item { LoadingScreen(Modifier.fillParentMaxHeight(0.5f)) }
            }

            is ScreenUiState.Success -> {
                val data = uiState.data
                items(data) { currencyExchangeRate ->
                    BranchCard(currencyExchangeRate = currencyExchangeRate)
                }
            }

            is ScreenUiState.Error -> {
                val message = uiState.message
                item {
                    ErrorScreen(
                        message = message,
                        modifier = Modifier.fillParentMaxHeight(0.5f)
                    )
                }
            }

            ScreenUiState.Empty -> { /* Do nothing */
            }
        }
    }
}