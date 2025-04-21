package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Reviews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reviews)

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

        val lecNav : LinearLayout = findViewById(R.id.lectureBtn)

        lecNav.setOnClickListener{
            val intent = Intent(this, lectures::class.java)
            startActivity(intent)
        }

        val addReviewNav : Button = findViewById(R.id.addReviewBtn)

        addReviewNav.setOnClickListener{
            val intent = Intent(this, add_review::class.java)
            startActivity(intent)
        }

        val forumBtnNav : ImageView = findViewById(R.id.forum)

        forumBtnNav.setOnClickListener{
            val intent = Intent(this, forum::class.java)
            startActivity(intent)
        }
    }
}