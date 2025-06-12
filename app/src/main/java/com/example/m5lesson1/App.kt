package com.example.m5lesson1

import android.app.Application
import com.example.m5lesson1.di.appModule
import com.example.m5lesson1.di.dataModule
import com.example.m5lesson1.di.domainModule
import com.example.m5lesson1.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(level = org.koin.core.logger.Level.INFO)
            modules(
                appModule,
                domainModule,
                dataModule,
                presentationModule,
            )
        }

    }
}