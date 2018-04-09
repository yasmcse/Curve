package com.example.yasirnazir.curve.di

import com.example.yasirnazir.curve.home.fragment.FragmentInputLayout
import dagger.Subcomponent

@Subcomponent(modules = [(HomeModule::class)])
interface HomeComponent {

    fun inject(homeFragment: FragmentInputLayout)
}