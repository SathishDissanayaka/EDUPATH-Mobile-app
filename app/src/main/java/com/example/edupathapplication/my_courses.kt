package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class my_courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_courses)

        val profileBtnNav : ImageView = findViewById(R.id.profileImg)

        profileBtnNav.setOnClickListener{
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }

        val homeBtnNav : ImageView = findViewById(R.id.home)

        homeBtnNav.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val quizBtnNav : ImageView = findViewById(R.id.quiz)

        quizBtnNav.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }

        val pythonBtn : LinearLayout = findViewById(R.id.python)

        pythonBtn.setOnClickListener{
            val intent = Intent(this, python_course::class.java)
            startActivity(intent)
        }
    }
}