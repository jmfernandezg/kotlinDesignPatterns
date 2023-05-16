package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderTest {

    @Test
    fun testBuild() {
        val componente = Componente.Builder()
            .setParam1("param 1")
            .setParam2(false)
            .setParam3(3)
            .build()

        assertEquals("param 1", componente.param1)
        assertEquals(false, componente.param2)
        assertEquals(3, componente.param3)
    }
}
