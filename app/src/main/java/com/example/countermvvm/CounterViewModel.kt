package com.example.countermvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val counterModel: CounterModel = CounterModel()
    private val _count: MutableLiveData<Int> = MutableLiveData()
    val count: LiveData<Int> = _count

    init {
        _count.postValue(counterModel.getCount())
    }

    fun dec() {
        counterModel.dec()
        setCount()
    }

    fun inc() {
        counterModel.inc()
        setCount()
    }

    private fun setCount() {
        _count.postValue(counterModel.getCount())
    }
}