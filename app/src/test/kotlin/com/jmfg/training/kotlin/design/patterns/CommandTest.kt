package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class CommandTest {
    @Test
    fun testCommand() {
        ProcesadorComandos()
            .agregarComando(AgregarOrden("1"))
            .agregarComando(AgregarOrden("2"))
            .agregarComando(PagarOrden("1"))
            .agregarComando(PagarOrden("2"))
            .procesar()
    }
}