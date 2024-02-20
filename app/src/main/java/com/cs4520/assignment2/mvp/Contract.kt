package com.cs4520.assignment2.mvp

interface Contract {
    interface View {
        fun initView()
        fun updateView()
        
    }

    interface Presenter {
        fun getCalculation(function:String, x:Double, y:Double):Double
        
    }
    interface Model {
        fun add(x:Double, y:Double): Double
        fun subtract(x:Double, y:Double): Double
        fun multiply(x:Double, y:Double): Double
        fun divide(x:Double, y:Double): Double
        
    }
}