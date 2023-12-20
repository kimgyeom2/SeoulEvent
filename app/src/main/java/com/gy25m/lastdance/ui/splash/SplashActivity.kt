package com.gy25m.lastdance.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gy25m.lastdance.R
import com.gy25m.lastdance.ui.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<TextView>(R.id.tv).setOnClickListener {
            var aa=Intent(this,MainActivity::class.java)
            startActivity(aa)
        }
    }
}