package com.example.yasirnazir.curve.di

import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @Provides
    fun provideViewModelFactory(): HomeViewModelFactory {
        return HomeViewModelFactory()
    }
}