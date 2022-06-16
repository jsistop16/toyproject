package com.example.imstagram

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


//앱실행 초기 스플래시 화면
class LoadingActivity : AppCompatActivity() {

    private val SPLASH_TIME : Long = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading)

        Handler(Looper.getMainLooper()).postDelayed({//Handler -> deprecated
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME)
    }
}