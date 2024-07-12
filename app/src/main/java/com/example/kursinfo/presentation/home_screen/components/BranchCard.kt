package com.example.kursinfo.presentation.home_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.kursinfo.R
import com.example.kursinfo.domain.model.CurrencyExchangeRate

@Composable
fun BranchCard(currencyExchangeRate: CurrencyExchangeRate) {
    val streetType = currencyExchangeRate.streetType
    val homeNumber = currencyExchangeRate.homeNumber
    val street = currencyExchangeRate.street
    val usdBuy = currencyExchangeRate.usdBuy
    val usdSell = currencyExchangeRate.usdSell
    val eurBuy = currencyExchangeRate.eurBuy
    val eurSell = currencyExchangeRate.eurSell
    val rubBuy = currencyExchangeRate.rubBuy
    val rubSell = currencyExchangeRate.rubSell

    val buyText = stringResource(id = R.string.buy)
    val sellText = stringResource(id = R.string.sell)
    val usdText = stringResource(id = R.string.usd)
    val eurText = stringResource(id = R.string.eur)
    val rubText = stringResource(id = R.string.rub)

    val smallPadding = dimensionResource(R.dimen.small_padding)
    val bottomPadding = dimensionResource(id = R.dimen.inner_padding)

    ElevatedCard(onClick = {}, modifier = Modifier.padding(bottom = bottomPadding)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "$streetType $street, $homeNumber",
                modifier = Modifier.padding(vertical = smallPadding),
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "$usdText  $buyText: $usdBuy $sellText: $usdSell")
            Text(text = "$eurText  $buyText: $eurBuy $sellText: $eurSell")
            Text(text = "$rubText  $buyText: $rubBuy $sellText: $rubSell")
        }
    }
}