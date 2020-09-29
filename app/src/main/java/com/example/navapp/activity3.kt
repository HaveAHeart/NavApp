package com.example.navapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_3.*

class activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        buttonAct3toAct1.setOnClickListener {
            setResult(1)
            finish()
        }
        buttonAct3toAct2.setOnClickListener {
            setResult(2)
            finish()
        }

        nav_view3.setOnNavigationItemReselectedListener {
            startActivity(Intent(applicationContext, activityAbout::class.java))
        }
    }

}