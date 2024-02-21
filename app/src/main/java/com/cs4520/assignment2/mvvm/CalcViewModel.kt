package com.cs4520.assignment2.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {
     var calcLiveData = MutableLiveData<Double>()

    // look into observersb

    fun calculate(opp:String, x:Double, y:Double): Double {
        var result = 0.0
        when (opp) {
            "add" -> {
                result = this.add(x,y)
            }
            "subtract" -> {
                result= this.subtract(x,y)
            }
            "multiply" -> {
                result= this.multiply(x,y)
            }
            "divide" -> {
                result = this.divide(x,y)
            }
        }
        return result
    }

    private fun add(x:Double, y:Double): Double {
        return x + y
    }

    private fun subtract(x:Double, y:Double): Double {
        return x - y
    }

    private fun multiply(x:Double, y:Double): Double {
        return x * y
    }

    private fun divide(x:Double, y:Double): Double {
        return x / y
    }
}