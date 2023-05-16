package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculadoraTest {

    @Test
    fun testSuma() {
        assertEquals(9, Calculadora().suma(4, 5), "La suma debe ser 9")
    }
}

