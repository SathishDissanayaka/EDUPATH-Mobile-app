package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val pyBtnNav : LinearLayout = findViewById(R.id.upBlock1)

        pyBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }

        val coursesBtnNav : ImageView = findViewById(R.id.courses)

        coursesBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }

        val quizBtnNav : ImageView = findViewById(R.id.quiz)

        quizBtnNav.setOnClickListener{
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }

        val profileBtnNav : ImageView = findViewById(R.id.profileImg)

        profileBtnNav.setOnClickListener{
            val intent = Intent(this, user_profile::class.java)
            startActivity(intent)
        }
    }
}