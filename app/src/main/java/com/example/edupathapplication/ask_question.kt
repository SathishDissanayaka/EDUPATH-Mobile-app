package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ask_question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ask_question)

        val subBtnNav : Button = findViewById(R.id.subQueBtn)

        subBtnNav.setOnClickListener{
            val intent = Intent(this, forum::class.java)
            startActivity(intent)
        }
    }
}