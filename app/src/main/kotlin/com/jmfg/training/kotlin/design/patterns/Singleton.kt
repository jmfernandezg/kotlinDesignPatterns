package com.jmfg.training.kotlin.design.patterns

// Singleton
object Driver {
    init {
        println("Inicializando la clase")
    }

    fun controlador() = apply {
        println("Drive de red: $this")
    }
}