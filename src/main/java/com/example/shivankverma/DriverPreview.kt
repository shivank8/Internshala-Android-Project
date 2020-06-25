package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var fname :String? ="h"
lateinit var txtFname:TextView
lateinit var txtFMobile:TextView
lateinit var txtFEmail:TextView
lateinit var txtFAadharID:TextView
lateinit var txtFVehicleType:TextView
lateinit var txtFDLNo:TextView
lateinit var txtFVehicleNo:TextView
lateinit var txtfAddress:TextView
lateinit var btnFsubmit: Button
class DriverPreview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_preview)
        txtFname=findViewById(R.id.txtFname)
        txtFMobile=findViewById(R.id.txtFmobile)
        txtFEmail=findViewById(R.id.txtFEmail)
        txtFAadharID=findViewById(R.id.txtFAadhar)
        txtfAddress=findViewById(R.id.txtFAddress)
        txtFname.setText(fnamen)
        txtfAddress.setText(location)
        txtFMobile.setText(fmobile)
        txtFEmail.setText(fEmail)
        txtFAadharID.setText(fAdharId)
        txtFVehicleType=findViewById(R.id.txtFname)
        txtFDLNo=findViewById(R.id.txtFDlno)
        txtFVehicleNo=findViewById(R.id.txtFVehicleNO)
        txtFVehicleType.setText(fvehicletype)
        txtFDLNo.setText(fDlno)
        txtFVehicleNo.setText(fVehicleNo)

        btnFsubmit=findViewById(R.id.btnFSubmit)
        btnFsubmit.setOnClickListener{
            val intent = Intent(this,DownloadActivity::class.java)
            startActivity(intent)
        }



    }
}