package com.example.m5lesson1.data.mapping

import com.example.m5lesson1.data.model.CountDto
import com.example.m5lesson1.domain.model.Count

    fun CountDto.toDomain(): Count {
        return Count(
            count = count,
            isIncrement = isIncrement,
        )
    }
