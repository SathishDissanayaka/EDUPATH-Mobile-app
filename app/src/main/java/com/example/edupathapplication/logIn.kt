package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class logIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_in)

        val googleBtnNav : Button = findViewById(R.id.googleBtn)
        googleBtnNav.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val fbBtnNav : Button = findViewById(R.id.fbBtn)
        fbBtnNav.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val logInBtnNav : Button = findViewById(R.id.logInBtn)
        logInBtnNav.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}