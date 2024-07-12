package com.example.kursinfo.presentation.home_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kursinfo.R
import com.example.kursinfo.presentation.home_screen.components.HomeContent

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = hiltViewModel()) {
    val uiState by homeViewModel.uiState.collectAsState()

    val innerPadding = dimensionResource(id = R.dimen.inner_padding)

    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding)
        ) {
            HomeContent(
                uiState = uiState,
                cityList = homeViewModel.cityList,
                selectedText = homeViewModel.selectedText,
                onCitySelected = { homeViewModel.selectedText = it },
                onFetchClicked = { homeViewModel.fetchCurrencyExchangeRates(homeViewModel.selectedText) },
                innerPadding = innerPadding
            )
        }
    }
}

