package com.example.yasirnazir.curve.di

import com.example.yasirnazir.curve.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: MyApp) {
    @Provides
    @Singleton
    fun provideApp() = app
}