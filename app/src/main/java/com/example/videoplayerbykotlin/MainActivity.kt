package com.example.videoplayerbykotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.videoplayerbykotlin.databinding.ActivityMainBinding
import com.example.videoplayerbykotlin.ui.home.HomeFragment
import com.example.videoplayerbykotlin.ui.list.ListFragment
import com.example.videoplayerbykotlin.ui.setting.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var bottomNavigationView : BottomNavigationView

    private val TAG ="MVVM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    replaceFragment(HomeFragment())
//                    Toast.makeText(applicationContext, "Home", Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "HomeFragment")
                    true
                }

                R.id.navigation_list -> {
                    replaceFragment(ListFragment())
//                    Toast.makeText(applicationContext, "List Video", Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "ListFragment")
                    true
                }

                R.id.navigation_setting -> {
                    replaceFragment(SettingFragment())
//                    Toast.makeText(applicationContext, "Notifications", Toast.LENGTH_SHORT).show()
                    Log.d(TAG, "SettingFragment")
                    true
                }

                else -> false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_main, fragment)
        fragmentTransaction.commit()
    }
}