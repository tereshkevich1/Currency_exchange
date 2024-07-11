package com.example.kursinfo.data.repository.di

import com.example.kursinfo.data.repository.ExchangeRateRepositoryImpl
import com.example.kursinfo.domain.repository.ExchangeRateRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun provideExchangeRateRepository(impl: ExchangeRateRepositoryImpl): ExchangeRateRepository
}