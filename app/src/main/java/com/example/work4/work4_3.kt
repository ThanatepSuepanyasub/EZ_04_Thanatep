package com.example.work4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class work4_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work43)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("Result", 0)


        val i: Button = findViewById(R.id.i)
        val j: Button = findViewById(R.id.j)
        val k: Button = findViewById(R.id.k)
        val l: Button = findViewById(R.id.l)


        i.setOnClickListener {
            val intent = Intent(this, work4_4::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)


        }
        j.setOnClickListener {
            val intent = Intent(this, work4_4::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        k.setOnClickListener {
            val intent = Intent(this, work4_4::class.java)
            intent.putExtra("Result", numrand)
            startActivity(intent)
        }
        l.setOnClickListener {
            val intent = Intent(this, work4_4::class.java)
            intent.putExtra("Result", numrand+1)
            startActivity(intent)
        }
    }
}
