package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val contText: TextView = findViewById(R.id.textView2)

        contText.setOnClickListener {
            val intent = Intent(this, onboarding1::class.java)
            startActivity(intent)
        }
    }

}