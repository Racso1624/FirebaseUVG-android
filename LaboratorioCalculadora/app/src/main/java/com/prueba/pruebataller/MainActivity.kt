package com.prueba.pruebataller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello: Button = findViewById(R.id.btnHello)

        btnHello.setOnClickListener{
            val intent: Intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
            finish()
        }
    }
}