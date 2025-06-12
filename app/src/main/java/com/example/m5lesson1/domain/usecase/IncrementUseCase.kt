package com.example.m5lesson1.domain.usecase

import com.example.m5lesson1.domain.repository.CounterRepository

class IncrementUseCase (
    private val repository: CounterRepository
){
    fun increment(){
        repository.increment()

    }
}