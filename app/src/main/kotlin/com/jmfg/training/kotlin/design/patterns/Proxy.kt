package com.jmfg.training.kotlin.design.patterns

interface Imagen {
    fun desplegar()
}

class ImagenReal(private val nombre: String) : Imagen {
    override fun desplegar() {
        println("Real: imagen desplegando...")
    }

    private fun leer() {
        println("Real: imagen leyendo de $nombre")
    }

    init {
        leer()
    }

}

class ImagenProxy(private val nombre: String) : Imagen {
    private var imagen: ImagenReal? = null
    override fun desplegar() {
        println("Desplegando imagen $nombre")
        imagen.let {
            if (it == null) imagen = ImagenReal(nombre)
            it?.desplegar()
        }
    }
}