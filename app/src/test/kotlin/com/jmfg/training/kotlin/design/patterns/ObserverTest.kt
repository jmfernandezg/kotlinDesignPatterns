package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test

class ObserverTest {

    @Test
    fun `probarObserver`() {
        val editor = Editor()
        val logs = LogListener()
        val mails = EmailListener()

        editor.events.suscribe(Event.OPEN, logs)
        editor.events.suscribe(Event.OPEN, mails)
        editor.events.suscribe(Event.SAVE, mails)

        editor.open("test.jpg")
        editor.save()

    }
}