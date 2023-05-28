package com.example.bottomnavigation.activities

import android.app.Activity
import android.content.ClipData.newIntent
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigation.R
import kotlinx.android.synthetic.main.activity_button_main.*

class ButtonMainActivity: AppCompatActivity(R.layout.activity_button_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnAppbarBot.setOnClickListener {

            val intent = Intent(this, AppBarBottomActivity::class.java)
            startActivity(intent)
        }

        btnBotNavWithVP.setOnClickListener {

            val intent = Intent(this, BottomNavWithViewPagerActivity::class.java)
            startActivity(intent)
        }

        btnBotSheet.setOnClickListener {

            val intent = Intent(this, BottomSheetActivity::class.java)
            startActivity(intent)
        }

        btnCollapsingToolbar.setOnClickListener {

            val intent = Intent(this, CollapsingToolbarActivity::class.java)
            startActivity(intent)
            finish();
        }

        btnConstraintLo.setOnClickListener {

            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
        }

        btnCoordinatorLo.setOnClickListener {

            val intent = Intent(this, CoordinatorActivity::class.java)
            startActivity(intent)
        }

        btnNavView.setOnClickListener {

            val intent = Intent(this, NavViewActivity::class.java)
            startActivity(intent)
        }

        btnOtherCommonUIE.setOnClickListener {

            val intent = Intent(this, OtherCommonUIElementActivity::class.java)
            startActivity(intent)
        }
    }


}