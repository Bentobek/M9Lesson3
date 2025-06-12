package com.example.m5lesson1.data.repository

import com.example.m5lesson1.data.datasource.CounterDataSource
import com.example.m5lesson1.domain.repository.CounterRepository
import com.example.m5lesson1.data.mapping.toDomain
import com.example.m5lesson1.domain.model.Count

class CounterRepositoryImpt: CounterRepository {


    private val db = CounterDataSource()

    override fun increment() {
        db.increment()
    }

    override fun decrement() {
        db.decrement()
    }

   override fun getCount(): Count {
        val response = db.getCount().toDomain()
        return response
    }
}


