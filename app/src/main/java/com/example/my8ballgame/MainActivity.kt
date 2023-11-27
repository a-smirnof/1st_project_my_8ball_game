package com.example.my8ballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val askMeButton : Button = findViewById(R.id.button)
        askMeButton.setOnClickListener{shakeBall()}
    }

    private fun shakeBall() {

        val ballImageView: ImageView = findViewById(R.id.imageView)

        val randomChoice = java.util.Random().nextInt(20) + 1
        val imageResource = when (randomChoice){
            1 -> R.drawable.mb1
            2 -> R.drawable.mb2
            3 -> R.drawable.mb3
            4 -> R.drawable.mb4
            5 -> R.drawable.mb5
            6 -> R.drawable.mb6
            7 -> R.drawable.mb6
            8 -> R.drawable.mb8
            9 -> R.drawable.mb9
            10 -> R.drawable.mb10
            11 -> R.drawable.mb11
            12 -> R.drawable.mb12
            13 -> R.drawable.mb13
            14 -> R.drawable.mb14
            15 -> R.drawable.mb15
            16 -> R.drawable.mb16
            17 -> R.drawable.mb17
            18 -> R.drawable.mb18
            19 -> R.drawable.mb19
            else -> R.drawable.mb1

        }

        ballImageView.setImageResource(imageResource)
    }
}