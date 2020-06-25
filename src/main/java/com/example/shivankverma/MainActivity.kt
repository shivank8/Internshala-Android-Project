package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

lateinit var txtSignup: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtSignup=findViewById(R.id.txtSignup)
        txtSignup.setOnClickListener{
            Toast.makeText(this, "Welcome to Customer Registration", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,Registration::class.java)
            startActivity(intent)
        }

    }



}