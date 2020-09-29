package com.example.navapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAct1toAct2.setOnClickListener {
            startActivity(Intent(this@MainActivity, activity2::class.java))
        }

        nav_view1.setOnNavigationItemReselectedListener {
            startActivity(Intent(applicationContext, activityAbout::class.java))
        }
    }

}