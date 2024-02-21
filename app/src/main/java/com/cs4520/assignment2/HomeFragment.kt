package com.cs4520.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.cs4520.assignment2.databinding.FragmentHomeBinding
import com.cs4520.assignment2.mvp.MVPFragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var mvpBtn: Button
    private lateinit var mvvmBtn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mvpBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_MVPFragment)


        }

        binding.mvvmBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_MVVMFragment)
        }
    }
}
