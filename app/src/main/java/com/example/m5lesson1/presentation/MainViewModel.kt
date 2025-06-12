package com.example.m5lesson1.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.m5lesson1.domain.usecase.DecrementUseCase
import com.example.m5lesson1.domain.usecase.GetCountUseCase
import com.example.m5lesson1.domain.usecase.IncrementUseCase
import com.example.m5lesson1.presentation.mapper.toUi
import com.example.m5lesson1.presentation.model.UiCount

class MainViewModel(
    private val getCountUseCase: GetCountUseCase,
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    ): ViewModel() {

    private val _uiCountData = MutableLiveData<UiCount>()
    val uiCountData: LiveData<UiCount> = _uiCountData

        fun increment(){
            incrementUseCase.increment()
            updateCount()
        }

        fun decrement(){
            decrementUseCase.decrement()
            updateCount()
        }

        fun updateCount(){
            val response = getCountUseCase.getCount()
            _uiCountData.value = response.toUi()

        }

}