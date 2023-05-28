package com.example.bottomnavigation.activities

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.bottomnavigation.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_collapsing_toolbar.*
import kotlinx.android.synthetic.main.activity_nav_view.*

class NavViewActivity: AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_view)

        setSupportActionBar(toolB)
        toolB.setTitleTextColor((resources.getColor(R.color.white)))

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolB,
            R.string.drawer_open,
            R.string.drawer_close
        )
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

        btnEnd.setOnClickListener(){
            srlMain.isRefreshing = false
        }
    }

    override fun onBackPressed() {
        when{
            drawerLayout.isDrawerOpen(GravityCompat.START) -> { drawerLayout.closeDrawer(GravityCompat.START) }
        else -> {
            super.onBackPressed()
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_camera -> {
                Toast.makeText(this, "This is Camera", Toast.LENGTH_SHORT).show()

                drawerLayout.closeDrawer(GravityCompat.START)
            }
            R.id.nav_gallery -> Toast.makeText(this, "This is Gallery", Toast.LENGTH_SHORT).show()
            R.id.nav_slideshow -> Toast.makeText(this, "This is Slideshow", Toast.LENGTH_SHORT).show()
            R.id.nav_manage -> Toast.makeText(this, "This is Manage", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}