package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work47)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val y: Button = findViewById(R.id.y)
        val z: Button = findViewById(R.id.z)
        val a1: Button = findViewById(R.id.a1)
        val b1: Button = findViewById(R.id.b1)


        y.setOnClickListener {
            val intent = Intent(this, work4_8::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        z.setOnClickListener {
            val intent = Intent(this, work4_8::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
        a1.setOnClickListener {
            val intent = Intent(this, work4_8::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        b1.setOnClickListener {
            val intent = Intent(this, work4_8::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}