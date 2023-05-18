package com.jmfg.training.kotlin.design.patterns

interface Command {
    fun execute()
}

class AgregarOrden(val id: String) : Command {
    override fun execute() {
        println("Agregando orden $id ")
    }
}

class PagarOrden(val id: String) : Command {
    override fun execute() {
        println("Pagando orden $id ")
    }
}

class ProcesadorComandos {
    val queue = mutableListOf<Command>()

    fun agregarComando(command: Command) = apply {
        queue.add(command)
    }

    fun procesar() = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}