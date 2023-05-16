package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactoryTest {
    @Test
    fun fabrica() {
        val monedaChina = MonedaFactory.codigo(China(4000))
        val monedaMexico = MonedaFactory.codigo(Mexico)

        assertEquals("MXN", monedaMexico.code, "Moneda de Mexico")
        assertEquals("CNY", monedaChina.code, "Moneda de China")
    }

}