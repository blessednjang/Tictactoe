package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterSix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_six)




        val backButton: Button = findViewById(R.id.buttonsix)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterSix, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}



