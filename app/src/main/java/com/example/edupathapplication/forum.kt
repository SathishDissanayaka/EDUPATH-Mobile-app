package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class forum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forum)

        val questionBtnNav : ImageView = findViewById(R.id.qBtn)

        questionBtnNav.setOnClickListener{
            val intent = Intent(this, Answers::class.java)
            startActivity(intent)
        }

        val askBtnNav : Button = findViewById(R.id.askQueBtn)

        askBtnNav.setOnClickListener{
            val intent = Intent(this, ask_question::class.java)
            startActivity(intent)
        }

        val backBtnNav : ImageView = findViewById(R.id.backBtn2)

        backBtnNav.setOnClickListener{
            val intent = Intent(this, python_course::class.java)
            startActivity(intent)
        }
    }
}