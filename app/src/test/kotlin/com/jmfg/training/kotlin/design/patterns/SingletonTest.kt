package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {

    @Test
    fun controlador() {
        val controlador1 = Driver.controlador()
        val controlador2 = Driver.controlador()

        assertEquals(controlador1, controlador2, "Los controladores deben de ser iguales")

    }
}