package com.cs4520.assignment2.mvp

class MVPModel: Contract.Model {
    override fun add(x:Float, y:Float): Float {
        return x + y
    }

    override fun subtract(x:Float, y:Float): Float {
        return x - y
    }

    override fun multiply(x:Float, y:Float): Float {
        return x * y
    }

    override fun divide(x:Float, y:Float): Float {
        return x / y
    }
}