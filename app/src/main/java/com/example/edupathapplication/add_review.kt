package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class add_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_review)

        val subRevBtnNav : Button = findViewById(R.id.submitReviewgBtn)
        subRevBtnNav.setOnClickListener{
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }

        val backBtnNav : ImageView = findViewById(R.id.backBtn2)

        backBtnNav.setOnClickListener{
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }
    }
}