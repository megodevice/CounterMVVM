package com.example.countermvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    private val counterModel: CounterModel = CounterModel()

    fun dec() {
        counterModel.dec()
    }

    fun inc() {
        counterModel.inc()
    }

    val count: LiveData<Int> = counterModel.getCount()

}