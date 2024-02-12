package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_two)


        val backButton: Button = findViewById(R.id.buttonTwo)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterTwo, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}



