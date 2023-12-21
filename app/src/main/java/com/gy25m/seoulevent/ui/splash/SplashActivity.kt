package com.gy25m.seoulevent.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gy25m.seoulevent.R
import com.gy25m.seoulevent.ui.login.LoginActivity
import com.gy25m.seoulevent.ui.main.MainActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<TextView>(R.id.tv).setOnClickListener {
            var aa=Intent(this,LoginActivity::class.java)
            startActivity(aa)
        }
    }
}