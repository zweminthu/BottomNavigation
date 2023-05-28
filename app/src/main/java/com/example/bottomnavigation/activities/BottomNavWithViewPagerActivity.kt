package com.example.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.bottomnavigation.R
import com.example.bottomnavigation.adapters.BotNavViewPagerAdapter
import kotlinx.android.synthetic.main.activity_bot_nav_with_view_pager.*

class BottomNavWithViewPagerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bot_nav_with_view_pager)

        viewPager.adapter = BotNavViewPagerAdapter(this)
        viewPager.currentItem = 1
        bot_nav.selectedItemId = R.id.action_home

        viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                when (position){
                    0 -> bot_nav.selectedItemId = R.id.action_profile
                    1 -> bot_nav.selectedItemId = R.id.action_home
                    2 -> bot_nav.selectedItemId = R.id.action_notifications
                }
            }
        })

        bot_nav.setOnNavigationItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId){
                R.id.action_profile -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.action_home -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.action_notifications -> {
                    viewPager.currentItem = 2
                    true
                }
            }
            true
        }
    }
}