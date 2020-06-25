package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var btnSsubmit:Button
var naaam:String?="naam"
lateinit var txtsname: TextView
lateinit var txtsMobile: TextView
lateinit var txtsEmail: TextView
lateinit var txtsAadharID: TextView
lateinit var txtsAddress:TextView

class SelllerPreview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selller_preview)
        txtsname=findViewById(R.id.txtSname)
        txtsMobile=findViewById(R.id.txtSmobile)
        txtsEmail=findViewById(R.id.txtSEmail)
        txtsAadharID=findViewById(R.id.txtSAadhar)
        txtsAddress=findViewById(R.id.txtSAadhar)
        txtsAddress.setText(location)
        txtsMobile.setText(smobile)
        txtsEmail.setText(sEmail)
        txtsAadharID.setText(sAdharId)

        btnSsubmit=findViewById(R.id.btnSSubmit)
        btnSsubmit.setOnClickListener{
                val intent= Intent(this,DownloadActivity::class.java)
                startActivity(intent)
            }
        }
    }
