package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertContains

class ChainOfResponsibilityTest {

    @Test
    fun `Test Chain`() {
        val authHeader = AuthHeader("1234")
        val contentHeader = ContentTypeHeader("app/json")
        val bodyHeader = BodyTypeHeader(
            """
            {
                "id": "1",
                "name": "Obi-1",
                "greeting": "Hello There"
            }
        """.trimIndent()
        )

        authHeader.next = contentHeader
        contentHeader.next = bodyHeader

        assertContains(authHeader.addHeader("---"), "Authorization: 1234")

    }
}