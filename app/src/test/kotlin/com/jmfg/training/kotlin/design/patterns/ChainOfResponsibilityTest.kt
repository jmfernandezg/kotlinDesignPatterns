package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class ChainOfResponsibilityTest {

    @Test
    fun `Test Chain`() {
        val authHeader = AuthHeader("1234")
        val contentHeader = ContentTypeHeader("app/json")
        val bodyHeader = BodyTypeHeader("<html><head><title>HEY THERE!</head></title></html>")

        authHeader.next = contentHeader
        contentHeader.next = bodyHeader


        println(authHeader.addHeader("Encabezado de autenticación"))
        println(contentHeader.addHeader("Encabezado sin auth"))

    }
}