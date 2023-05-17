package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CompositeTest {

    @Test
    fun probarComposite() {
        val memoria = Memoria()
            .add(RAM())
            .add(ROM())

        val pc = Computador()
            .add(memoria)
            .add(Procesador())
            .add(DiscoDuro())

        println("Precio ${pc.precio}")

        assertEquals("PC", pc.nombre)
        assertEquals(9500, pc.precio)

    }
}
