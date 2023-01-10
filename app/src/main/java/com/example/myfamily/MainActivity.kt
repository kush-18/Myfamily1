package com.example.myfamily

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.view.SupportActionModeWrapper
import androidx.fragment.app.Fragment
import com.example.myfamily.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener { menuItem->
            when (menuItem.itemId) {
                R.id.nav_Home -> {
                    inflateFragment(HomeFragment.newInstance())
                }
                R.id.nav_Profile -> {
                    inflateFragment(profileFragment.newInstance())
                }
                R.id.nav_Guard -> {
                    inflateFragment(GuardFragment.newInstance())
                }
                R.id.nav_Dashboard -> {
                    inflateFragment(dashboardFragment.newInstance())
                }
            }
            true

        }
        bottomBar.selectedItemId = R.id.nav_Home
        }

    private fun inflateFragment(newInstance: Fragment) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(com.google.android.material.R.id.container, newInstance)
            transaction.commit()
    }


}



