package com.example.countermvvm

import androidx.lifecycle.MutableLiveData

class CounterModel {

    private val _count: MutableLiveData<Int> = MutableLiveData()

    init {
        _count.value = 0
    }

    fun getCount(): MutableLiveData<Int> = _count

    fun dec() {
        _count.value = _count.value!! - 1
    }

    fun inc() {
        _count.value = _count.value!! + 1
    }

}