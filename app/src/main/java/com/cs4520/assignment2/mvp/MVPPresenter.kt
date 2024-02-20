package com.cs4520.assignment2.mvp

class MVPPresenter(view: Contract.View): Contract.Presenter {

    private var view: Contract.View = view
    private var model: Contract.Model = MVPModel()

    init {
        view.initView()
    }



    override fun getCalculation(function:String, x:Double, y:Double): Double {
        var result = 0.0

        when (function) {
            "add" -> {
                result = model.add(x,y)
            }
            "subtract" -> {
                result= model.subtract(x,y)
            }
            "multiply" -> {
                result= model.multiply(x,y)
            }
            "divide" -> {
                result = model.divide(x,y)
            }
        }
        view.updateView()
        return result
    }

}