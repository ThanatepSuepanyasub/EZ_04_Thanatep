package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work46)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val u: Button = findViewById(R.id.u)
        val v: Button = findViewById(R.id.v)
        val w: Button = findViewById(R.id.w)
        val x: Button = findViewById(R.id.x)


        u.setOnClickListener {
            val intent = Intent(this, work4_7::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        v.setOnClickListener {
            val intent = Intent(this, work4_7::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
        w.setOnClickListener {
            val intent = Intent(this, work4_7::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        x.setOnClickListener {
            val intent = Intent(this, work4_7::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}