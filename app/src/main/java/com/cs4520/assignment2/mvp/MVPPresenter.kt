package com.cs4520.assignment2.mvp

class MVPPresenter(view: Contract.View): Contract.Presenter {

    private var view: Contract.View = view
    private var model: Contract.Model = MVPModel()
    private var lastResult: Double = 0.0

    init {
        view.initView()
    }



    override fun getCalculation(function:String, x:Double, y:Double) {

        when (function) {
            "add" -> {
                lastResult = model.add(x,y)
            }
            "subtract" -> {
                lastResult= model.subtract(x,y)
            }
            "multiply" -> {
                lastResult= model.multiply(x,y)
            }
            "divide" -> {
                lastResult = model.divide(x,y)
            }
        }
        view.updateView()
    }

    override fun getResult(): Double {
        return lastResult
    }

}