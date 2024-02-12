package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MonsterThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monster_three)




        val backButton: Button = findViewById(R.id.buttonThree)

        backButton.setOnClickListener {
            val intent = Intent(this@MonsterThree, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}


