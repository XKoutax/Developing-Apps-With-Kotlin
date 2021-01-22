package com.asfartz.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class DiceRollerActivity : AppCompatActivity() {
    lateinit var rollButton: Button
    lateinit var resultImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        rollButton = findViewById(R.id.roll_button)
        resultImg = findViewById(R.id.dice_image)

        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            val r = rollDice()
            Snackbar.make(it, "Rolled $r", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() : Int {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImg.setImageResource(drawableResource)
        return randomInt
    }
}