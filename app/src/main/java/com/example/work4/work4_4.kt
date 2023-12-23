package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work44)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val m: Button = findViewById(R.id.m)
        val n: Button = findViewById(R.id.n)
        val o: Button = findViewById(R.id.o)
        val p: Button = findViewById(R.id.p)


        m.setOnClickListener {
            val intent = Intent(this, work4_5::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        n.setOnClickListener {
            val intent = Intent(this, work4_5::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        o.setOnClickListener {
            val intent = Intent(this, work4_5::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        p.setOnClickListener {
            val intent = Intent(this, work4_5::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
    }
}
