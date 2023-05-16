package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class LazyInitTest {

    @Test
    fun lazyInit() {

        val ventana = Ventana()
        ventana.mostrarMensaje("PRUEBA!")

        assertNotNull(ventana.alerta)

        val sistema = Sistema()
        sistema.mostrarMensaje("SISTEMA!")

        assertNotNull(sistema.alerta)


    }
}