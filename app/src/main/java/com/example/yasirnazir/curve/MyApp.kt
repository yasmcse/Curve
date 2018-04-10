package com.example.yasirnazir.curve

import android.app.Application
import com.example.yasirnazir.curve.di.AppComponent
import com.example.yasirnazir.curve.di.AppModule
import com.example.yasirnazir.curve.di.DaggerAppComponent


class MyApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()


    }

    fun getAppComponentThis(): AppComponent = appComponent
}