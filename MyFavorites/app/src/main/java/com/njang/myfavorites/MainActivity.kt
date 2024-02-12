package com.njang.myfavorites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var  LikeMeNow: Button
    private lateinit var  EatMeNow: Button
    private lateinit var  FlyMeNow: Button
    private lateinit var  VisitMeNow: Button
    private lateinit var  DriveMeNow: Button
    private lateinit var  PlayMeNow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LikeMeNow = findViewById(R.id.LikeMeNow)
        EatMeNow = findViewById(R.id.EatMeNow)
        FlyMeNow = findViewById(R.id.FlyMeNow)
        VisitMeNow = findViewById(R.id.VisitMeNow)
        DriveMeNow = findViewById(R.id.DriveMeNow)
        PlayMeNow = findViewById(R.id.PlayMeNow)
    LikeMeNow.setOnClickListener {
        Toast.makeText(this, getString(R.string.LikeMENow), Toast.LENGTH_SHORT).show()
    }
        EatMeNow.setOnClickListener {
            Toast.makeText(this, getString(R.string.EatMeNow), Toast.LENGTH_SHORT).show()
        }
        FlyMeNow.setOnClickListener {
            Toast.makeText(this,  getString(R.string.FlyMENow), Toast.LENGTH_SHORT).show()
        }
        VisitMeNow.setOnClickListener {
            Toast.makeText(this, getString(R.string.VisitMENow), Toast.LENGTH_SHORT).show()
        }
        DriveMeNow.setOnClickListener {
            Toast.makeText(this, getString(R.string.DriveMENow), Toast.LENGTH_SHORT).show()
        }
       PlayMeNow.setOnClickListener {
            Toast.makeText(this, getString(R.string.PlayMENow), Toast.LENGTH_SHORT).show()
        }





    }
}