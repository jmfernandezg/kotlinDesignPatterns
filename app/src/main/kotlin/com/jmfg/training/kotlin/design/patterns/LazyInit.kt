package com.jmfg.training.kotlin.design.patterns

class Alerta {
    var mensaje: String? = null
    fun mostrar() {
        println("Mensaje de alerta $mensaje")
    }
}

class Ventana {
    val alerta by lazy { Alerta() }

    fun mostrarMensaje(mensaje: String) {
        alerta.mensaje = mensaje
        alerta.mostrar()
    }
}

class Sistema {
    lateinit var alerta: Alerta

    fun mostrarMensaje(mensaje: String) {
        alerta = Alerta()
        alerta.mensaje = mensaje
        alerta.mostrar()
    }
}