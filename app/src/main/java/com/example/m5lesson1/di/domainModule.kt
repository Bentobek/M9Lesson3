package com.example.m5lesson1.di

import com.example.m5lesson1.domain.usecase.DecrementUseCase
import com.example.m5lesson1.domain.usecase.GetCountUseCase
import com.example.m5lesson1.domain.usecase.IncrementUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCountUseCase(get()) }
}