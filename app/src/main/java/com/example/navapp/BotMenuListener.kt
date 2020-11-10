package com.example.navapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bot_menu.*

open class BotMenuListener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bot_menu)


    }

    fun setListener(item: MenuItem) {
        startActivity(Intent(applicationContext, activityAbout::class.java))
    }
}