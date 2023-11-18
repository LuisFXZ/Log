package com.luisfxz.log_res_pru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val GoToRegister = findViewById<TextView>(R.id.go_to_register)
        GoToRegister.setOnClickListener{goToRegister()}

    }

    private fun goToRegister (){
        val i = Intent(this,RegisterActivity::class.java)
        startActivity(i)
    }

}