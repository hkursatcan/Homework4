package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        buttonGoToB.setOnClickListener{
            val yeniIntent_a = Intent(this@ActivityA,ActivityB::class.java)
            startActivity(yeniIntent_a)
        }
    }

}