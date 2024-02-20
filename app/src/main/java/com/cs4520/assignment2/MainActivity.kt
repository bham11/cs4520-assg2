package com.cs4520.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView, HomeFragment())
                    .commitAllowingStateLoss()
}}}}