package com.example.bottomnavigation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.bottomnavigation.fragments.HomeFragment
import com.example.bottomnavigation.fragments.NotiFragment
import com.example.bottomnavigation.fragments.ProfileFragment

class BotNavViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return ProfileFragment()
            1 -> return HomeFragment()
            2 -> return NotiFragment()

        }
        return HomeFragment()
    }
}