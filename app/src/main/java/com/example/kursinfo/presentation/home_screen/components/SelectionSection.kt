package com.example.kursinfo.presentation.home_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.kursinfo.R

@Composable
fun SelectionSection(
    cityList: List<String>,
    selectedText: String,
    onCitySelected: (String) -> Unit,
    onFetchClicked: () -> Unit
) {
    val spacePadding = dimensionResource(id = R.dimen.column_space_padding)
    val verticalPadding = dimensionResource(id = R.dimen.inner_padding)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(spacePadding),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = verticalPadding)
    ) {
        ExposedDropdownMenuBox(cityList, selectedText, onCitySelected)
        ElevatedButton(
            onClick = onFetchClicked,
            modifier = Modifier
                .height(52.dp)
                .width(200.dp)
        ) {
            Text(text = "Fetch")
        }
    }
}