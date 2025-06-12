package com.example.m5lesson1.domain.usecase

import com.example.m5lesson1.domain.model.Count
import com.example.m5lesson1.domain.repository.CounterRepository

class GetCountUseCase (
    private val repository: CounterRepository
) {

    fun getCount(): Count {
        return repository.getCount()
    }
}