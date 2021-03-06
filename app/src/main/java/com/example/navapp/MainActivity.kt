package com.example.navapp

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BotMenuListener() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAct1toAct2.setOnClickListener {
            startActivity(Intent(applicationContext, activity2::class.java))
        }

        buttonAct1toAct3.setOnClickListener {
            startActivity(Intent(applicationContext, activity3::class.java))
        }
    }
}