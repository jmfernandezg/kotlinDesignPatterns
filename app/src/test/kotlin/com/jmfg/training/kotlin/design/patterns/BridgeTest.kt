package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BridgeTest {

    @Test
    fun probarBridge() {
        val tv = TV()
        val radio = Radio()

        val tvRemote = ControlRemoto(tv)
        val radioRemote = ControlRemoto(radio)

        repeat(3) {
            tvRemote.volumenArriba()
        }
        tvRemote.volumenAbajo()

        repeat(4) {
            radioRemote.volumenArriba()
        }

        assertEquals(2, tv.volumen)
        assertEquals(4, radio.volumen)

    }
}

