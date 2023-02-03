package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var searchButton = findViewById<Button>(R.id.searchButton)

        // When the 'searchButton' is clicked, call the callActivity function
        searchButton.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.cityText)
        val content = editText.text.toString()

        // intent is used for switching to the next screen. We add the city input to the intent and pass it to the next screen (WeatherActivity)
        val intent = Intent(this, WeatherActivity::class.java).also {
            it.putExtra("CITY", content)
            startActivity(it)
        }
    }
}