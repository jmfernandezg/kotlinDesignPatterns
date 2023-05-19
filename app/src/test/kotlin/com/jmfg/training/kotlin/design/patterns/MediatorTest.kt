package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class MediatorTest {

    @Test
    fun `Probar Mediator`() {
        val mediator = Mediator()
        val alicia = UsuarioChat(mediator, "alicia")
        val bob = UsuarioChat(mediator, "bob")

        alicia.enviar("hola")
        bob.enviar("que tal")
    }
}