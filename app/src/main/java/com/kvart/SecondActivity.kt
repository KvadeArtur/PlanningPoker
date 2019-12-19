package com.kvart

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    private lateinit var butt: Button
    var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        value = intent.getIntExtra("key", 0)
        butt = findViewById<View>(R.id.imageNumb) as Button

        butt.setOnClickListener{
            butt.text = value.toString()
            butt.setBackgroundColor(Color.GREEN)
        }
    }
}
