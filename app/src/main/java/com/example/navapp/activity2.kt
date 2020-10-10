package com.example.navapp

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class activity2 : BotMenuListener() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        buttonAct2toAct1.setOnClickListener {
            startActivity(Intent(applicationContext, activity3::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK))
        }
        buttonAct2toAct3.setOnClickListener {
            startActivity(Intent(applicationContext, activity3::class.java))
        }
    }

}