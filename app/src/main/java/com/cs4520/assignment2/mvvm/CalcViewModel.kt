package com.cs4520.assignment2.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel() {
    var calcLiveData = MutableLiveData<Double>()

    private val calc = CalcModel()

    fun setCalculation(function:String, x:Double, y:Double) {
       var result = 0.0

        when (function) {
            "add" -> {
                result = calc.add(x,y)
            }
            "subtract" -> {
                result = calc.subtract(x,y)
            }
            "multiply" -> {
                result = calc.multiply(x,y)
            }
            "divide" -> {
                result = calc.divide(x,y)
            }
        }
        calcLiveData.value = result
    }
}