package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CommandTest {
    @Test
    fun testCommand() {
        val procesador = ProcesadorComandos()
            .agregarComando(AgregarOrden("1"))
            .agregarComando(AgregarOrden("2"))
            .agregarComando(PagarOrden("1"))
            .agregarComando(PagarOrden("2"))
            .procesar()

        assertEquals(0, procesador.queue.size)
    }

}