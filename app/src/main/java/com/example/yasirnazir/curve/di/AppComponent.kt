package com.example.yasirnazir.curve.di

import com.example.yasirnazir.curve.MyApp
import com.example.yasirnazir.curve.home.fragment.FragmentInputLayout
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class,HomeModule::class))
interface AppComponent {
    fun inject(app: MyApp)
    fun inject(fragment: FragmentInputLayout)
}