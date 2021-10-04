package com.example.cu_lab_mst_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val name = findViewById<EditText>(R.id.txtName)
        //val uid = findViewById<EditText>(R.id.txtUID)
        val phone  = findViewById<EditText>(R.id.txtPhone)

        val RegBtn = findViewById<Button>(R.id.btnRegister)

        RegBtn.setOnClickListener(){

            val i = Intent(this,Profile::class.java)

            i.putExtra("UName",name.text.toString())
            i.putExtra("Phone",phone.text.toString())


            startActivity(i)
        }

    }
}