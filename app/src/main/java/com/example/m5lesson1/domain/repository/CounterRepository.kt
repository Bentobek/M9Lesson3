package com.example.m5lesson1.domain.repository

import com.example.m5lesson1.domain.model.Count

interface CounterRepository {

    fun increment()

    fun decrement()

    fun getCount(): Count

}