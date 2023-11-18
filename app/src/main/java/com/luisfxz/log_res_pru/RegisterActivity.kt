package com.luisfxz.log_res_pru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val GoToRegister = findViewById<TextView>(R.id.go_to_login)
        GoToRegister.setOnClickListener{goToRegister()}

    }

    private fun goToRegister(){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }

}