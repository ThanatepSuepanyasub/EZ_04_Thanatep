package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work48)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val c1: Button = findViewById(R.id.c1)
        val d1: Button = findViewById(R.id.d1)
        val e1: Button = findViewById(R.id.e1)
        val f1: Button = findViewById(R.id.f1)


        c1.setOnClickListener {
            val intent = Intent(this, work4_9::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        d1.setOnClickListener {
            val intent = Intent(this, work4_9::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
        e1.setOnClickListener {
            val intent = Intent(this, work4_9::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        f1.setOnClickListener {
            val intent = Intent(this, work4_9::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}