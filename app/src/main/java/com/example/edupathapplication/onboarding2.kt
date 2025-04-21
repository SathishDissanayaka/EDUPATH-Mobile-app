package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)

        val nextButton1Nav: Button = findViewById(R.id.next_button2)

        nextButton1Nav.setOnClickListener{
            val intent = Intent(this, onboarding3::class.java)
            startActivity(intent)
        }

        val skipButton2Nav: Button = findViewById(R.id.skip_button2)

        skipButton2Nav.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }
}