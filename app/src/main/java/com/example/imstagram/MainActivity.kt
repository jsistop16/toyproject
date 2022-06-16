package com.example.imstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.imstagram.databinding.ActivityMainBinding
import com.example.imstagram.databinding.FragmentHomeBinding
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.navigationView.run{
            setOnItemSelectedListener{
                when(it.itemId){
                    R.id.home -> {
                        val homeFragment = FragmentHome()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, homeFragment).commit()
                    }
                    R.id.search -> {
                        val searchFragment = FragmentSearch()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, searchFragment).commit()
                    }
                    R.id.reels -> {
                        val reelsFragment = FragmentReels()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, reelsFragment).commit()
                    }
                    R.id.shop -> {
                        val shopFragment = FragmentShop()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, shopFragment).commit()
                    }
                    R.id.profile -> {
                        val profileFragment = FragmentProfile()
                        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, profileFragment).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.home
        }

    }
}