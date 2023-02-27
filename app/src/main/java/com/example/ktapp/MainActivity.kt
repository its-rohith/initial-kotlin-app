/**
 * MainActivity.kt
 * To handle all UI related operations.
 */
package com.example.ktapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.ktapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * Activity binder object
     */
    private lateinit var binding: ActivityMainBinding

    /**
     * View model class
     */
    private val diceViewModel = DiceViewModel()

    /**
     * OnCreate method for viewing the activities and components.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val text: ImageView = binding.textView
        val button: Button = binding.button
        // Observer for Dice data change
        diceViewModel.startRollDice().observe(this,
            { t ->
                when (t?.currentFace) {
                    1 -> text.setImageResource(R.drawable.dice_1)
                    2 -> text.setImageResource(R.drawable.dice_2)
                    3 -> text.setImageResource(R.drawable.dice_3)
                    4 -> text.setImageResource(R.drawable.dice_4)
                    5 -> text.setImageResource(R.drawable.dice_5)
                    6 -> text.setImageResource(R.drawable.dice_6)
                }
            })

        //Button click lister for dice roll
        button.setOnClickListener {
            diceViewModel.startRollDice()
        }
    }
}