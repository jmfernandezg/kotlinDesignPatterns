package com.jmfg.training.kotlin.design.patterns

class Impresora(private val formatterStrategy: (String) -> String) {
    fun print(message: String) {
        println(formatterStrategy(message))
    }
}

val formatterMin = { it: String -> it.lowercase() }
val formatterMay = { it: String -> it.uppercase() }
