package com.example.app

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  companion object {
    init {
      System.loadLibrary("mylib")
    }
  }

  external fun sayHello(): String

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val resultTextView: TextView = findViewById(R.id.result)

    resultTextView.text = sayHello()
  }
}
