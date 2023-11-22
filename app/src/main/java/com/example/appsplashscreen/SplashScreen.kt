package com.example.appsplashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class SplashScreen : AppCompatActivity() {

    private lateinit var splashImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splashImageView = findViewById(R.id.splashImageView)


        Glide.with(this)
            .asGif()
            .load(R.drawable.homer)
            .into(splashImageView)


        Handler().postDelayed({

            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        private const val SPLASH_TIME_OUT = 3000
    }
}
