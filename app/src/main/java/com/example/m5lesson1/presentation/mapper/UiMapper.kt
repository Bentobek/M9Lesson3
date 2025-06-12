package com.example.m5lesson1.presentation.mapper

import com.example.m5lesson1.domain.model.Count
import com.example.m5lesson1.presentation.model.UiCount


    fun Count.toUi(): UiCount {
        return UiCount(
            count = this.count,
            operationType = if (this.isIncrement) "Плюс" else "Минус"
        )
}