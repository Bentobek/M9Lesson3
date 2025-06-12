package com.example.m5lesson1.domain.usecase

import com.example.m5lesson1.domain.repository.CounterRepository

class DecrementUseCase(
    private val repository: CounterRepository
) {

    fun decrement() {
        repository.decrement()
    }
}