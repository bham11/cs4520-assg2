package com.cs4520.assignment2.mvp

interface Contract {
    interface View {
        fun initView()
        fun updateView()
        
    }

    interface Presenter {
        fun getCalculation(function:String, x:Float, y:Float)
        
    }
    interface Model {
        fun add(x:Float, y:Float): Float
        fun subtract(x:Float, y:Float): Float
        fun multiply(x:Float, y:Float): Float
        fun divide(x:Float, y:Float): Float
        
    }
}