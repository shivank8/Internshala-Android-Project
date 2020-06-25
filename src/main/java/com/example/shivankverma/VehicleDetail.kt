package com.example.shivankverma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

lateinit var btnvehicleSunmit:Button
lateinit var sprVehicleType: Spinner
lateinit var etDlNo: EditText
lateinit var etVehicleNumber: EditText
var vehicleType = arrayOf("Bike","Scooty")
//var arrayAdapter:ArrayAdapter<String>?= null
var fDlno:String?=""
var fVehicleNo:String?=""
var fvehicletype:String?=""
class VehicleDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_detail)
        btnvehicleSunmit=findViewById(R.id.btnVehicleSubmit)

        sprVehicleType=findViewById(R.id.sprVehicleType)
        val adapter =ArrayAdapter(this,android.R.layout.simple_list_item_1, vehicleType)
        sprVehicleType.adapter=adapter
        sprVehicleType.onItemSelectedListener{

        }


        btnvehicleSunmit.setOnClickListener{
            val intent= Intent(this,DriverPreview::class.java)
            startActivity(intent)
            etDlNo=findViewById(R.id.etDLnumber)
            etVehicleNumber=findViewById(R.id.etVehiclenumber)
            fDlno= etDlNo.text.toString()
            fVehicleNo= etVehicleNumber.text.toString()
        }
    }
}

operator fun AdapterView.OnItemSelectedListener?.invoke(function: () -> Unit) {


}
