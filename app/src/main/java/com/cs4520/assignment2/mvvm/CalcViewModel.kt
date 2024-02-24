package com.cs4520.assignment2.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {
    var calcLiveData = MutableLiveData<Double>()

    fun add(x: Double, y: Double): Double {
        return x + y
    }

    fun subtract(x: Double, y: Double): Double {
        return x - y
    }

    fun multiply(x: Double, y: Double): Double {
        return x * y
    }

    fun divide(x: Double, y: Double): Double {
        return x / y
    }
}