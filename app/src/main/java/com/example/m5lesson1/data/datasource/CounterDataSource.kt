package com.example.m5lesson1.data.datasource

import com.example.m5lesson1.data.model.CountDto

class CounterDataSource {

    private var countDto = CountDto()
    private var count = 0

    fun increment(){
        countDto = CountDto(
            count = count++,
            isIncrement = true,
        )
    }

    fun decrement(){
        countDto = CountDto(
            count = count--,
            isIncrement = false,
        )
    }
    fun getCount() = countDto

}