/**
 * Dice.kt
 * Dice class for executing the logic of dice roll.
 * Business logic should be added to the class.
 */
package com.example.ktapp

import android.util.Log
import androidx.lifecycle.MutableLiveData

class Dice(side: Int) {

    /**
     * Live dice data class
     */
    private val mutableDiceData: MutableLiveData<DiceData> = MutableLiveData()

    /**
     * To store the
     */
    private val currentSide = 1..side

    /**
     * Method to execute the rolling of dice
     */
    fun rollDice(): MutableLiveData<DiceData> {
        //To get a random cube side
        val random = currentSide.random();
        val value = DiceData(random)
        Log.d("RK" , "Value : $value")
        mutableDiceData.value = value;
        return mutableDiceData
    }
}