package com.example.helloexamplefindviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_hello)
        button.setOnClickListener {
            var inputField = findViewById<EditText>(R.id.editText_name)
            var name = inputField.text.trim()
            if (name.isEmpty()) {
                inputField.error = "No name"
                return@setOnClickListener
            }
            var messageField = findViewById<TextView>(R.id.textView_message)
            messageField.text = "Hello $name"
        }
    }
}