package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FacadeTest {

    @Test
    fun probarFacade() {
        val repo = UserRepo()
        val usuario = Usuario("admin")

        repo.guardar(usuario)

        val guardado = repo.find()

        assertEquals("admin", guardado.username)
    }
}