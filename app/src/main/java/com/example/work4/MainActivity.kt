package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Button = findViewById(R.id.a)
        val b: Button = findViewById(R.id.b)
        val c: Button = findViewById(R.id.c)
        val d: Button = findViewById(R.id.d)


        var numrand: Int = 0


        a.setOnClickListener {
            val intent = Intent(this, work4_2::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)


        }
        b.setOnClickListener {
            val intent = Intent(this, work4_2::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        c.setOnClickListener {
            val intent = Intent(this, work4_2::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        d.setOnClickListener {
            val intent = Intent(this, work4_2::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}
