package com.example.cu_lab_mst_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val UserName = findViewById<TextView>(R.id.NameTxt)
    //    val User_id = findViewById<TextView>(R.id.UidTxt)
        val Userphone = findViewById<TextView>(R.id.PhoneTxt)


        val GetName:String = intent.getStringExtra("UName").toString()
        val Getphone : String= intent.getStringExtra("Phone").toString()

        UserName.text = "Name : "+GetName
        Userphone.text = "Phone : "+Getphone


    }
}