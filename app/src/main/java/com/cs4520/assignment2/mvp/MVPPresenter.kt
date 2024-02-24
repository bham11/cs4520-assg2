package com.cs4520.assignment2.mvp

class MVPPresenter(view: Contract.View): Contract.Presenter {

    private var view: Contract.View = view
    private var model: Contract.Model = MVPModel()


    init {
        view.initView()
    }



    override fun getCalculation(function:String, x:Double, y:Double) {

        when (function) {
            "add" -> {
                model.setLastResult(model.add(x,y))
            }
            "subtract" -> {
                model.setLastResult(model.subtract(x,y))
            }
            "multiply" -> {
                model.setLastResult(model.multiply(x,y))
            }
            "divide" -> {
                model.setLastResult(model.divide(x,y))
            }
        }
        view.updateView()
    }

    override fun getResult(): Double {
        return model.getLastResult()
    }

}