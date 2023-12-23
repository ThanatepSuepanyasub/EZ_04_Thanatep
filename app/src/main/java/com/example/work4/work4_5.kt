package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work45)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val q: Button = findViewById(R.id.q)
        val r: Button = findViewById(R.id.r)
        val s: Button = findViewById(R.id.s)
        val t: Button = findViewById(R.id.t)


        q.setOnClickListener {
            val intent = Intent(this, work4_6::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)


        }
        r.setOnClickListener {
            val intent = Intent(this, work4_6::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        s.setOnClickListener {
            val intent = Intent(this, work4_6::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        t.setOnClickListener {
            val intent = Intent(this, work4_6::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
    }
}