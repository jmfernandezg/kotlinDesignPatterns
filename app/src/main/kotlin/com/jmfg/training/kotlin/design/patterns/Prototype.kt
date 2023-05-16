package com.jmfg.training.kotlin.design.patterns

abstract class Figura : Cloneable {
    var tipo: String? = null

    abstract fun dibujar()

    public override fun clone(): Any {
        return super.clone()
    }

}

class Rectangulo : Figura() {
    init {
        tipo = "Rectangulo"
    }

    override fun dibujar() {
        println("Rectangulo dibujar")
    }
}

class Cuadrado : Figura() {
    init {
        tipo = "Cuadrado"
    }

    override fun dibujar() {
        println("Cuadrado dibujar")
    }
}

class Circulo : Figura() {
    init {
        tipo = "Circulo"
    }

    override fun dibujar() {
        println("Circulo dibujar")
    }
}


object Cache {
    private val mapa = hashMapOf<Int, Figura>()

    fun cargar() {
        mapa[1] = Circulo()
        mapa[2] = Cuadrado()
        mapa[3] = Rectangulo()
    }

    fun getFigura(id: Int) = mapa[id]?.clone() as Figura

}