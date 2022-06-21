package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_x.*

class ActivityX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x)

        buttonGoToY.setOnClickListener {
            val yeniIntent_x  = Intent(this@ActivityX,ActivityY::class.java)

            startActivity(yeniIntent_x)

        }
    }
}