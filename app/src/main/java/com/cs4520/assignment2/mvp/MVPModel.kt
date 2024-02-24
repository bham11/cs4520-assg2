package com.cs4520.assignment2.mvp

class MVPModel: Contract.Model {
    private var lastResult: Double = 0.0
    override fun setLastResult(x: Double) {
        lastResult =  x
    }

    override fun getLastResult(): Double {
        return lastResult
    }


    override fun add(x:Double, y:Double): Double {
        return x + y
    }

    override fun subtract(x:Double, y:Double): Double {
        return x - y
    }

    override fun multiply(x:Double, y:Double): Double {
        return x * y
    }

    override fun divide(x:Double, y:Double): Double {
        return x / y
    }
}