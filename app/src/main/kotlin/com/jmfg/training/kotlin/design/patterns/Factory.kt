package com.jmfg.training.kotlin.design.patterns

sealed class Pais
object Mexico : Pais()
class UK : Pais() {
    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

data class China(val poblacion: Int) : Pais()

class Moneda(val code: String)

object MonedaFactory {
    fun codigo(pais: Pais) = when (pais) {
        is China -> Moneda("CNY")
        is Mexico -> Moneda("MXN")
        is UK -> Moneda("GBP")
    }
}