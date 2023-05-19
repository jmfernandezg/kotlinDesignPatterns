package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MementoTest {

    @Test
    fun `Probar Memento`() {
        val originador = Originador("original")
        val care = Caretaker()

        care.guardar(originador.crearMemento())
        originador.estado = "Estado 1"
        care.guardar(originador.crearMemento())

        originador.estado = "Estado 2"
        care.guardar(originador.crearMemento())

        assertEquals("Estado 2", originador.estado)

        originador.restauraMemento(care.restaurar(1))

        assertEquals("Estado 1", originador.estado)
    }
}