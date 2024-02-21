package com.cs4520.assignment2.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {
    private var calcLiveData = MutableLiveData<Double>()

    fun getCalLiveData(): LiveData<Double> {
        return calcLiveData
    }

    fun setCalcLiveData(result: Double) {
        calcLiveData.value = result
    }
}