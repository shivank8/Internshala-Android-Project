package com.example.shivankverma

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

lateinit var btnSubmit:Button
lateinit var btnSLocationPicker2:Button
lateinit var sprShoptype:Spinner
var shopType = arrayOf("Small","Medium","Big")
class ShopDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_detail)
        btnSubmit=findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener{
            val intent= Intent(this,SelllerPreview::class.java)
            startActivity(intent)
        }
        btnSLocationPicker2=findViewById(R.id.btnSLocationPicker2)

        sprShoptype=findViewById(R.id.sprShopcategory)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, shopType)
        sprShoptype.adapter=adapter

        btnSLocationPicker2.setOnClickListener{
            val intent= Intent(this,ChooseLocation::class.java)
            startActivity(intent)
        }
    }
}