package com.example.yasirnazir.curve.di

import android.app.Application
import com.example.yasirnazir.curve.MyApp
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component()
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    abstract fun inject(app: MyApp)


    fun plus(homeModule:HomeModule):HomeComponent
}