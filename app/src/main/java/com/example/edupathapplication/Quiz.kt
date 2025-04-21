package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Quiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        val homeBtnNav : ImageView = findViewById(R.id.home)

        homeBtnNav.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val profileBtnNav : ImageView = findViewById(R.id.profileImg)

        profileBtnNav.setOnClickListener{
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }

        val coursesBtnNav : ImageView = findViewById(R.id.courses)

        coursesBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }

        val startNowNav : TextView = findViewById(R.id.startNow)

        startNowNav.setOnClickListener{
            val intent = Intent(this, question_paper::class.java)
            startActivity(intent)
        }
    }
}