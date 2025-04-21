package com.example.edupathapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val signUpBtnNav : Button = findViewById(R.id.signUpBtn)

        signUpBtnNav.setOnClickListener{
            val intent = Intent(this, logIn::class.java)
            startActivity(intent)
        }

    }
}