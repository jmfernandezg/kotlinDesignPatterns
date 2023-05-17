package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class ProxyTest {
    @Test
    fun probarProxy() {
        val imagen  = ImagenProxy("mac.jpg")

        imagen.desplegar()

        println("--------")

        imagen.desplegar()

    }
}