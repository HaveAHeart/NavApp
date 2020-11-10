package com.example.navapp

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_3.*

class activity3 : BotMenuListener()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        buttonAct3toAct1.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
        buttonAct3toAct2.setOnClickListener {
            finish()
        }
    }
}