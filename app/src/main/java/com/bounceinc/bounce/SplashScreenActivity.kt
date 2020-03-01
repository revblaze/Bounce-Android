package com.bounceinc.bounce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule
import android.content.Intent

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(3000) {
            val intent = Intent(applicationContext, WebViewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
