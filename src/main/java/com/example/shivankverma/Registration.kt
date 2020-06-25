package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnDelivery: Button
lateinit var btnShop: Button
class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnDelivery=findViewById(R.id.btnDelivery)

        btnShop=findViewById(R.id.btnShop)

       btnDelivery.setOnClickListener{
            val intent=Intent(this,DeliveryRegistration::class.java)
            startActivity(intent)
        }

        btnShop.setOnClickListener{
            val intent= Intent(this,SellerRegister::class.java)
            startActivity(intent)
        }

    }
}