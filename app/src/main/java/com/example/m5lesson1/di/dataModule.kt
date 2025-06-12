package com.example.m5lesson1.di

import com.example.m5lesson1.data.repository.CounterRepositoryImpt
import com.example.m5lesson1.domain.repository.CounterRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single<ApiService> {
        get<Retrofit>().create(ApiService::class.java)
    }

    single<CounterRepository> {
        CounterRepositoryImpt()
    }
}