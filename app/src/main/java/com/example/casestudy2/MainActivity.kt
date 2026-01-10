package com.example.casestudy2

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enable clickable links
        val linkTextView = findViewById<TextView>(R.id.linkText)
        linkTextView.movementMethod = LinkMovementMethod.getInstance()

        // Load Taj Mahal image from URL
        val imageView = findViewById<ImageView>(R.id.tajMahalImage)
        val imageUrl =
            "https://wallpapers.com/images/featured/taj-mahal-w1bfoxwb7sj291gs.jpg"

        Glide.with(this)
            .load(imageUrl)
            .into(imageView)
    }
}
