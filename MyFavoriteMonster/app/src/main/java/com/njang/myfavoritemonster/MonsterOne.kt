package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_one)


        val backButton: Button = findViewById(R.id.buttonOne)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterOne, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}