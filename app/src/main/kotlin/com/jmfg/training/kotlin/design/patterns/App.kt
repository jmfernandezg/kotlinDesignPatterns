package com.jmfg.training.kotlin.design.patterns

class App {
    val greeting: String
        get() = "Hello World!"
}

fun main() {
    println(App().greeting)
}
