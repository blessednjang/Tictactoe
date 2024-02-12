package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_four)

        val backButton: Button = findViewById(R.id.buttonFour)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterFour, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}



