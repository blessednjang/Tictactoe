package com.njang.mazegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.njang.mazegame.databinding.ActivityMainBinding


class MainActivity :AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.upbutton.setOnClickListener() {
            binding.b2.animate().apply {
                translationYBy(-50f)
                startActivity(intent)
            }
        }

        binding.downbutton.setOnClickListener() {
            binding.b2.animate().apply {
                translationYBy(50f)
                startActivity(intent)
            }
        }


        binding.leftbutton.setOnClickListener() {
            binding.b2.animate().apply {
                translationXBy(-50f)
                startActivity(intent)
            }
        }
        binding.rightbutton.setOnClickListener() {
            binding.b2.animate().apply {
                translationXBy(50f)
                startActivity(intent)
            }
        }
    }
}