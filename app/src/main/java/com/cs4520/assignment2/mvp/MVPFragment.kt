package com.cs4520.assignment2.mvp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.cs4520.assignment2.databinding.FragmentMvpBinding


class MVPFragment : Fragment(), Contract.View {
    private lateinit var binding : FragmentMvpBinding

    private var presenter: MVPPresenter? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMvpBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = MVPPresenter(this)




    }

    override fun initView() {

        binding.addBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                presenter?.getCalculation(
                    "add",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble()
                )
                this.clearCalc()
            }
            else {
                this.clearCalc()
                Toast.makeText(context, "Calculation Unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }

        binding.subBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                presenter?.getCalculation(
                    "subtract",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble()
                )
                this.clearCalc()
            }
            else {
                this.clearCalc()
                Toast.makeText(context, "Calculation Unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }
        binding.multBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                presenter?.getCalculation(
                    "multiply",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble()
                )
                this.clearCalc()
            }
            else {
                this.clearCalc()
                Toast.makeText(context, "Calculation Unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }
        binding.divBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDouble() != 0.0) {
                presenter?.getCalculation(
                    "divide",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble()
                )
                this.clearCalc()
            }
            else {
                this.clearCalc()
                Toast.makeText(context, "Calculation Unsuccessful", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun updateView() {
        binding.resultText.visibility = View.VISIBLE
        val calc = presenter?.getResult()
        val text = "Result: $calc"
        binding.resultText.text = text


    }
    private fun clearCalc() {
        binding.firstNum.text.clear()
        binding.secondNum.text.clear()
    }
}