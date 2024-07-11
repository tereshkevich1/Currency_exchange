package com.example.kursinfo.data.remote.di

import com.example.kursinfo.data.remote.data_source.CurrencyExchangeDataSource
import com.example.kursinfo.data.remote.data_source.CurrencyExchangeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {
    @Binds
    fun provideCurrencyExchangeDataSource(impl: CurrencyExchangeDataSourceImpl): CurrencyExchangeDataSource
}