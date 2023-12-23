package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work42)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val e: Button = findViewById(R.id.e)
        val f: Button = findViewById(R.id.f)
        val g: Button = findViewById(R.id.g)
        val h: Button = findViewById(R.id.h)


        e.setOnClickListener {
            val intent = Intent(this, work4_3::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)


        }
        f.setOnClickListener {
            val intent = Intent(this, work4_3::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        g.setOnClickListener {
            val intent = Intent(this, work4_3::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        h.setOnClickListener {
            val intent = Intent(this, work4_3::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}
