package com.cs4520.assignment2.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.cs4520.assignment2.databinding.FragmentMvvmBinding


class MVVMFragment : Fragment() {
    private lateinit var binding : FragmentMvvmBinding
    private  lateinit var viewModel: CalcViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMvvmBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity())[CalcViewModel::class.java]
        this.setCalcBtnListeners()
        // observed data should take care of this
        val resultObserver = Observer<Double> { newResult ->
            binding.resultText.visibility = View.VISIBLE
            val text = "Result: $newResult"
            binding.resultText.text = text
        }

        viewModel.calcLiveData.observe(viewLifecycleOwner, resultObserver)
        }




    private fun setCalcBtnListeners() {
        binding.addBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                viewModel.setCalculation( "add",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble())
            }
            else {
                this.giveErrorMsg()
            }
            this.clearCalc()

        }
        binding.subBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                viewModel.setCalculation( "subtract",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble())
            }
            else {
                this.giveErrorMsg()
            }
            this.clearCalc()
        }
        binding.multBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null) {
                viewModel.setCalculation( "multiply",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble())
            }
            else {
                this.giveErrorMsg()
            }
            this.clearCalc()
        }
        binding.divBtn.setOnClickListener {
            if(binding.firstNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDoubleOrNull() != null
                && binding.secondNum.text.toString().toDouble() != 0.0) {
                viewModel.setCalculation( "divide",
                    binding.firstNum.text.toString().toDouble(),
                    binding.secondNum.text.toString().toDouble())
            }
            else {
                this.giveErrorMsg()
            }
            this.clearCalc()
        }
    }

    private fun clearCalc() {
        binding.firstNum.text.clear()
        binding.secondNum.text.clear()
    }

    private fun giveErrorMsg() {
        binding.resultText.visibility = View.INVISIBLE
        Toast.makeText(context, "Calculation Unsuccessful", Toast.LENGTH_SHORT).show()
    }
}