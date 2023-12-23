package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work410)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val k1: Button = findViewById(R.id.k1)
        val l1: Button = findViewById(R.id.l1)
        val m1: Button = findViewById(R.id.m1)
        val n1: Button = findViewById(R.id.n1)


        k1.setOnClickListener {
            val intent = Intent(this, final1::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)


        }
        l1.setOnClickListener {
            val intent = Intent(this, final1::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        m1.setOnClickListener {
            val intent = Intent(this, final1::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        n1.setOnClickListener {
            val intent = Intent(this, final1::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}