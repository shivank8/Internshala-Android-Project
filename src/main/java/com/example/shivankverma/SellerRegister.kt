package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

lateinit var  etsName: EditText
lateinit var etsAddress: EditText
lateinit var etsEmail: EditText
lateinit var etsMobile: EditText
lateinit var etsAdharID: EditText
lateinit var btnsLocationPicker: Button
var snamen2:String?="heloo"
var smobile:String?="1234567890"
var sAddress:String?="Abhgujii,456251"
var sEmail:String?="xyz@xyz.com"
var sAdharId:String?="1234567889"

lateinit var btnNext2:Button
lateinit var btnSLocationPicker:Button
class SellerRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seller_register)
        btnNext2=findViewById(R.id.btNext)

        btnSLocationPicker=findViewById(R.id.btnSLocationPicker)

        btnSLocationPicker.setOnClickListener{
            val intent= Intent(this,ChooseLocation::class.java)
            startActivity(intent)
        }
       btnNext2.setOnClickListener{
            val intent= Intent(this, ShopDetail::class.java)
            startActivity(intent)
           etsName=findViewById(R.id.etName2)
           snamen2= etName.text.toString()
           intent.putExtra("snamen2", snamen2)
           etsMobile=findViewById(R.id.etNumber)
           smobile= etMobile.text.toString()
           etsEmail=findViewById(R.id.etEmail)
           sEmail= etEmail.text.toString()
           etsAdharID=findViewById(R.id.etID)
           sAdharId= etAdharID.text.toString()
        }

    }
}