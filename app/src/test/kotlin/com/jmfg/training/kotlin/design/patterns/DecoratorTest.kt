package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class DecoratorTest {

    @Test
    fun `probar Decorador`() {
        val cafeNormal = CafeteraNormal()
        val cafeAuto = CafeteraAuto(cafeNormal)

        cafeAuto.cafeRegular()
        cafeAuto.cafeExpresso()
        cafeAuto.cafeLatte()
    }
}