package com.example.ktapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun roll_dice() {
        val Dice = Dice(10)
        val result = Dice.rollDice()
        assertTrue("Success $result ",result in 1..6)
    }
}