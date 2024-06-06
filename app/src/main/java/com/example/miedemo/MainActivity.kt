package com.example.miedemo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button) // Corrected layout file name

        val greetButton = findViewById<Button>(R.id.greetButton)
        greetButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Good Day Rob Garcia and MIE Team. Thank you for taking the time out of your day to interview me.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}