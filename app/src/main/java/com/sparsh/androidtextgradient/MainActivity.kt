package com.sparsh.androidtextgradient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.set
import androidx.core.text.toSpannable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.tvHello)
        val text = "Hello World!"
        val purple = ContextCompat.getColor(this,R.color.purple_200)
        val teal = ContextCompat.getColor(this,R.color.purple_200)
        val spannable = text.toSpannable()
        spannable[0..text.length] = LinearGradientSpan(text, text, purple, teal)
        textView.text = spannable
    }
}