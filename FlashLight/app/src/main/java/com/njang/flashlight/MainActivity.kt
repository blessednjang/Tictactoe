package com.njang.flashlight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {


    private lateinit var imageView: ImageView
    private  lateinit var toggleButton: Button
    private  var imImageVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnClickListener {
            toggleImageAndText()
        }
    }

        private fun toggleImageAndText() {
            imImageVisible = !imImageVisible
            if (imImageVisible) {
                imageView.setImageResource(R.drawable.flashlightoff)
                toggleButton.text = getString(R.string.turn_on)
            } else {
                imageView.setImageResource(R.drawable.flashlighton)
                toggleButton.text = getString(R.string.turn_Off)
            }
    }
}