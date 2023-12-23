package com.example.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class final1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final1)

        val total: TextView = findViewById(R.id.Result)
        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("Result", 0)
        total.setText(numrand.toString())
    }
}
