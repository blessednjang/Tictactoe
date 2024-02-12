package com.njang.myfavoritemonster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njang.myfavoritemonster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Button that navigates from MainActivity to MonsterOne activity.
        binding.buttonOne.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterOne:: class.java)
            startActivity(intent)
            finish()

        }

        binding.buttonTwo.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterTwo:: class.java)
            startActivity(intent)
            finish()

        }

        binding.buttonThree.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterThree:: class.java)
            startActivity(intent)
            finish()

        }

        binding.buttonFour.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterFour:: class.java)
            startActivity(intent)
            finish()

        }

        binding.buttonFive.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterFive:: class.java)
            startActivity(intent)
            finish()

        }

        binding.buttonsix.setOnClickListener {
            val intent = Intent(this@MainActivity, MonsterSix:: class.java)
            startActivity(intent)
            finish()

        }


    }
}