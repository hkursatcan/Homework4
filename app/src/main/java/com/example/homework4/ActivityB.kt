package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        buttonGoToY2.setOnClickListener{
            val yeniIntent_b = Intent(this@ActivityB,ActivityY::class.java)
            startActivity(yeniIntent_b)
        }
    }
}