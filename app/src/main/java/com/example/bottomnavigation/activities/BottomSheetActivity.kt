package com.example.bottomnavigation.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigation.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_bot_sheet.*

class BottomSheetActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bot_sheet)

        val sheet = BottomSheetBehavior.from(botSheet)

        btnShow.setOnClickListener(){
            when{
                sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                    sheet.state = BottomSheetBehavior.STATE_EXPANDED
                }
                else -> {
                    sheet.state = BottomSheetBehavior.STATE_COLLAPSED
                }
            }
        }
    }
}