package com.example.yasirnazir.curve.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.yasirnazir.curve.home.viewmodel.MainViewModel

class HomeViewModelFactory() :
        ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel() as T
            else -> super.create(modelClass)
        }

    }

}