package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work49)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val g1: Button = findViewById(R.id.g1)
        val h1: Button = findViewById(R.id.h1)
        val i1: Button = findViewById(R.id.i1)
        val j1: Button = findViewById(R.id.j1)


        g1.setOnClickListener {
            val intent = Intent(this, work4_10::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        h1.setOnClickListener {
            val intent = Intent(this, work4_10::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        i1.setOnClickListener {
            val intent = Intent(this, work4_10::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
        j1.setOnClickListener {
            val intent = Intent(this, work4_10::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}