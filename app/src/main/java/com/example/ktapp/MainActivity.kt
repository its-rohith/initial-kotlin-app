package com.example.ktapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.ktapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dice = Dice(6)
        val text: ImageView = binding.textView
        val button: Button = binding.button
        button.setOnClickListener(View.OnClickListener {
            when (dice.rollDice()) {
                1 -> text.setImageResource(R.drawable.dice_1)
                2 -> text.setImageResource(R.drawable.dice_2)
                3 -> text.setImageResource(R.drawable.dice_3)
                4 -> text.setImageResource(R.drawable.dice_4)
                5 -> text.setImageResource(R.drawable.dice_5)
                6 -> text.setImageResource(R.drawable.dice_6)
            }
        })
    }
}