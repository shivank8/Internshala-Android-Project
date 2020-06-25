package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

lateinit var btnNext: Button
lateinit var  etName: EditText
lateinit var etAddress:EditText
lateinit var etEmail:EditText
lateinit var etMobile:EditText
lateinit var etAdharID:EditText
lateinit var btnLocationPicker: Button
var fnamen:String?="h"
var fmobile:String?="1234567890"
var fAddress:String?="Abhgujii,456251"
var fEmail:String?="xyz@xyz.com"
var fAdharId:String?="1234567889"
var placeRequest=1
class DeliveryRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_registration)
        btnNext=findViewById(R.id.btnnext)
        btnLocationPicker=findViewById(R.id.btnLocationPicker)

        btnLocationPicker.setOnClickListener{
            val intent= Intent(this,ChooseLocation::class.java)
            startActivity(intent)
        }
        etAddress=findViewById(R.id.etAddress)
        etAddress.setText(location)

        btnNext.setOnClickListener{
            val intent= Intent(this,VehicleDetail::class.java)
            startActivity(intent)
            etName=findViewById(R.id.etName)
            fnamen= etName.text.toString()
            //intent.putExtra("fnamen", fnamen)
            etMobile=findViewById(R.id.etNumber)
            fmobile= etMobile.text.toString()
            etEmail=findViewById(R.id.etEmail)
            fEmail= etEmail.text.toString()
            etAdharID=findViewById(R.id.etID)
            fAdharId= etAdharID.text.toString()

        }
}}