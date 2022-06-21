package com.example.homework4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoToX.setOnClickListener {
            val yeniIntent = Intent(this@MainActivity,ActivityX::class.java)
            startActivity(yeniIntent)
        }
        buttonGoToA.setOnClickListener{
            val yeniIntent_2 = Intent(this@MainActivity,ActivityA::class.java)
            startActivity(yeniIntent_2)

            }
        }

    }
