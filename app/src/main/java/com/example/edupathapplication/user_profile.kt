package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class user_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)

        val backBtnNav : ImageView = findViewById(R.id.back)

        backBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }
    }
}