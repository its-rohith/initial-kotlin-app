package com.example.ktapp

class Dice(private val side: Int) {

    fun rollDice(): Int {
        val currentSide = 1..side
        val result = currentSide.random();
        //TODO : for testing only , added one number as lucky number
        val luckyNumber = 4
        when (result) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! You rolled a 6. Try again!")
        }
        return result
    }
}