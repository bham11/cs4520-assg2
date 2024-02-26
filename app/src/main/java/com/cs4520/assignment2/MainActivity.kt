package com.cs4520.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.navigation.fragment.NavHostFragment

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity)
        if (savedInstanceState == null) {
            val appHost = NavHostFragment.create(R.navigation.nav_graph)

            supportFragmentManager.commit {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView, appHost)
                    .setPrimaryNavigationFragment(appHost)
                    .commit()
}}}}