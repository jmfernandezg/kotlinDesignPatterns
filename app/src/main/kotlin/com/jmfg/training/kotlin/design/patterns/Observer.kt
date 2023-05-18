package com.jmfg.training.kotlin.design.patterns

import com.jmfg.training.kotlin.design.patterns.Event.OPEN
import com.jmfg.training.kotlin.design.patterns.Event.SAVE
import java.io.File

enum class Event { OPEN, SAVE }
interface EventListener {
    fun update(eventType: Event?, file: File?)
}

class LogListener : EventListener {
    override fun update(eventType: Event?, file: File?) {
        println("Updated Log $eventType for file $file")
    }
}

class EmailListener : EventListener {
    override fun update(eventType: Event?, file: File?) {
        println("Updated Email $eventType for file $file")
    }
}

class EventManager(vararg ops: Event) {
    private var listeners = mutableMapOf<Event, MutableList<EventListener>>()

    init {
        ops.forEach {
            listeners[it] = mutableListOf()
        }
    }

    fun suscribe(eventType: Event?, listener: EventListener) = listeners[eventType]?.add(listener)

    fun notify(eventType: Event?, file: File?) = listeners[eventType]?.forEach { it.update(eventType, file) }
}

class Editor {
    var events = EventManager(OPEN, SAVE)
    private var file: File? = null

    fun open(path: String) {
        file = File(path)
        events.notify(OPEN, file)
    }

    fun save() {
        file?.let {
            events.notify(SAVE, it)
        }
    }
}