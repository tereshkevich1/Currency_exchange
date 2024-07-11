package com.example.kursinfo.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = hiltViewModel(), modifier: Modifier) {
    Surface(modifier = modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = homeViewModel.date.value)
        }
    }
}