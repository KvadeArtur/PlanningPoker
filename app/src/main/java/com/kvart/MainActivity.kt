package com.kvart

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.butt0).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 0)
            startActivity(intent)
        }

        findViewById<View>(R.id.butt1).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 1)
            startActivity(intent)
        }

        findViewById<View>(R.id.butt2).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 2)
            startActivity(intent)
        }

        findViewById<View>(R.id.butt3).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", 3)
            startActivity(intent)
        }
    }
}
