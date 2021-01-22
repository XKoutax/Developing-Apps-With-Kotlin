package com.asfartz.androidappswithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var appDiceRollerButton: Button
    lateinit var appAboutMeButton: Button
    lateinit var colorMyViewsbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appDiceRollerButton = findViewById(R.id.dice_roller_app_button)
        appDiceRollerButton.setOnClickListener {
            val diceRollerIntent: Intent = Intent(this, DiceRollerActivity::class.java)
            startActivity(diceRollerIntent)
        }

        appAboutMeButton = findViewById(R.id.about_me_app_button)
        appAboutMeButton.setOnClickListener {
            val aboutMeIntent: Intent = Intent(this, AboutMeActivity::class.java)
            startActivity(aboutMeIntent)
        }

        colorMyViewsbutton = findViewById(R.id.color_my_views_button)
        colorMyViewsbutton.setOnClickListener {
            val colorMyViewsIntent: Intent = Intent(this, ColorMyViewsActivity::class.java)
            startActivity(colorMyViewsIntent)
        }

    }

}