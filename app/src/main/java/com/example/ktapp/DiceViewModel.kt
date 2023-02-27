/**
 * DiceViewModel.kt
 * View Model class for Dice
 */
package com.example.ktapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {

    /**
     * Dice object
     */
    var dice: Dice? = Dice(6)

    /**
     * Live data object for DiceData class
     */
    var diceData: MutableLiveData<DiceData>? = null

    /**
     * Method for executing the dice roll in Dice class
     */
    fun startRollDice(): LiveData<DiceData> {
        diceData = dice!!.rollDice()
        return diceData!!
    }
}