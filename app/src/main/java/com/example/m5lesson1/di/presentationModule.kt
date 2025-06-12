package com.example.m5lesson1.di

import com.example.m5lesson1.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel {
        MainViewModel(
            getCountUseCase = get(),
            incrementUseCase = get(),
            decrementUseCase = get()
        )
    }
}