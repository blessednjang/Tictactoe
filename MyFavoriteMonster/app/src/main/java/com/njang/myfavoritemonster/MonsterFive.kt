package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterFive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_five)




        val backButton: Button = findViewById(R.id.buttonFive)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterFive, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}



