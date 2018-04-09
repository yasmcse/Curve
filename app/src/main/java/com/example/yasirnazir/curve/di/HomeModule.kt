package com.example.yasirnazir.curve.di

import dagger.Provides

class HomeModule {
    @Provides
    fun proveViewModelFactory(): HomeViewModelFactory {
        return HomeViewModelFactory()
    }
}