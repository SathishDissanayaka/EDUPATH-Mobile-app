package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class python_course : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_python_course)

        val backBtnNav : ImageView = findViewById(R.id.back)

        backBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }

        val lecNav : LinearLayout = findViewById(R.id.lectureBtn)

        lecNav.setOnClickListener{
            val intent = Intent(this, lectures::class.java)
            startActivity(intent)
        }

        val reviewNav : LinearLayout = findViewById(R.id.reviewBtn)

        reviewNav.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }

        val startBtnNav : Button = findViewById(R.id.startLearningBtn)

        startBtnNav.setOnClickListener{
            val intent = Intent(this, lectures::class.java)
            startActivity(intent)
        }

        val forumBtnNav : ImageView = findViewById(R.id.forum)

        forumBtnNav.setOnClickListener{
            val intent = Intent(this, forum::class.java)
            startActivity(intent)
        }

    }
}