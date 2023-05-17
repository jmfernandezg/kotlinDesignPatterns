package com.jmfg.training.kotlin.design.patterns

interface Cafetera {
    fun cafeRegular()
    fun cafeExpresso()
}

class CafeteraNormal : Cafetera {
    override fun cafeRegular() {
        println("Haciendo cafe regular")
    }

    override fun cafeExpresso() {
        println("Haciendo cafe espresso")
    }
}

class CafeteraAuto(private val cafetera: Cafetera) : Cafetera by cafetera {
    override fun cafeExpresso() {
        println("Auto: Haciendo cafe espresso")
    }

    fun cafeLatte() {
        println("Auto: Haciendo latte")
        cafetera.cafeRegular()
        println("Auto: agregando leche")
    }
}
