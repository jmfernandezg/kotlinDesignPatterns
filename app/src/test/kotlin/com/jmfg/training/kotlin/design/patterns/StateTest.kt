package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StateTest {

    @Test
    fun testState() {
        val auth = Autorizador()
        auth.login("admin")
        println(auth)
        assertEquals(true, auth.isAuthorized())
        assertEquals("admin", auth.username())

        auth.logout()
        println(auth)
        assertEquals(false, auth.isAuthorized())
        assertEquals("UNKNOWN", auth.username())
    }
}