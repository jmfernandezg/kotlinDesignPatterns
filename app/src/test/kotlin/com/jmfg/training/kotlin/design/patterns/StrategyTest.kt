package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class StrategyTest{

    @Test
    fun testStrategy () {
        val input = "Hello There! General Keno-bi"

        Impresora(formatterMin).print(input)
        Impresora(formatterMay).print(input)
    }
}