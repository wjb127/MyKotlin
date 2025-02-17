package com.example.mykotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterText = findViewById<TextView>(R.id.counterText)
        val incrementButton = findViewById<Button>(R.id.incrementButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        counterText.text = "카운트: $counter"

        incrementButton.setOnClickListener {
            counter++
            counterText.text = "카운트: $counter"
        }

        resetButton.setOnClickListener {
            counter = 0
            counterText.text = "카운트: $counter"
        }
    }
} 