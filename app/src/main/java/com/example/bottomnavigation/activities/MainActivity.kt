package com.example.bottomnavigation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.fragments.HomeFragment
import com.example.bottomnavigation.fragments.NotiFragment
import com.example.bottomnavigation.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragment(HomeFragment())

        bot_nav.setOnNavigationItemSelectedListener { menuItem: MenuItem ->
            when(menuItem.itemId){
                R.id.action_home -> {
                    switchFragment(HomeFragment())
                }
                R.id.action_notifications -> {
                    switchFragment(NotiFragment())
                }
                R.id.action_profile -> {
                    switchFragment(ProfileFragment())
                }
            }
            false
        }
    }
    private fun switchFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, fragment)
            .commit()
    }
}