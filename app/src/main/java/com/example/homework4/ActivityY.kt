package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_y.*

class ActivityY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_y)

        buttonGeriGit.setOnClickListener{
            val yeniIntent_geri = Intent(this@ActivityY,MainActivity::class.java)
            startActivity(yeniIntent_geri)
        }
    }

    override fun onBackPressed() {

        val yeniIntent_y = Intent(this@ActivityY,MainActivity::class.java)

        startActivity(yeniIntent_y)
    }
}