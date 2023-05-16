package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrototypeTest {

    @Test
    fun `Patron prototipo`() {
        Cache.cargar()

        val f1 = Cache.getFigura(1)
        val f2 = Cache.getFigura(2)
        val f3 = Cache.getFigura(3)

        assertEquals("Circulo", f1.tipo)
        assertEquals("Cuadrado", f2.tipo)
        assertEquals("Rectangulo", f3.tipo)
    }
}