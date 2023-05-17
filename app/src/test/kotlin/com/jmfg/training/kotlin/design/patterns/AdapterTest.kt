package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterTest {

    @Test
    fun adapterTest() {
        val dbData = DbGenerator.generar()
        val displayData = DisplayDataAdapter(DataDisplay())
            .convertir(dbData)

        assertEquals(3, displayData.size)
        assertEquals(1, displayData[0].index)
        assertEquals("2", displayData[1].datos)
    }
}