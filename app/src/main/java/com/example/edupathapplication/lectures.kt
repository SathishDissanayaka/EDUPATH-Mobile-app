package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lectures : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lectures)

        val profileBtnNav : ImageView = findViewById(R.id.backBtn2)

        profileBtnNav.setOnClickListener{
            val intent = Intent(this, my_courses::class.java)
            startActivity(intent)
        }

        val overviewNav : LinearLayout = findViewById(R.id.overviewBtn)

        overviewNav.setOnClickListener {
            val intent = Intent(this, python_course::class.java)
            startActivity(intent)
        }

        val reviewNav : LinearLayout = findViewById(R.id.reviewBtn)

        reviewNav.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }
    }
}