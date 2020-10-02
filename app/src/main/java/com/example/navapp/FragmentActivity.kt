package com.example.navapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fragment_layout.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_layout)

        nav_viewFrag.setOnNavigationItemReselectedListener {
            startActivity(Intent(applicationContext, activityAbout::class.java))
        }

    }

}