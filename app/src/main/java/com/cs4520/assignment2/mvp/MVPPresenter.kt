package com.cs4520.assignment2.mvp

class MVPPresenter(view: Contract.View): Contract.Presenter {

    private var view: Contract.View = view
    private var model: Contract.Model = MVPModel()

    init {
        view.initView()
    }



    override fun getCalculation(function:String, x:Float, y:Float) {
        when (function) {
            "add" -> {
                model.add(x,y)
            }
            "subtract" -> {
                model.subtract(x,y)
            }
            "multiply" -> {
                model.multiply(x,y)
            }
            "divide" -> {
                model.divide(x,y)
            }
        }
        view.updateView()
    }

}