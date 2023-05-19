package com.jmfg.training.kotlin.design.patterns

class Mediator {
    private val usuarios = mutableListOf<UsuarioChat>()
    fun sendMessage(msg: String, usuarioChat: UsuarioChat) {
        usuarios.filterNot { it == usuarioChat }.forEach { it.recibir(msg) }
    }

    fun agregar(usuarioChat: UsuarioChat) = usuarios.add(usuarioChat)
}

class UsuarioChat(private val mediator: Mediator, private val nombre: String) {
    fun enviar(msg: String) {
        println("Usuario $nombre enviando:  $msg")
        mediator.sendMessage(msg, this)
    }

    fun recibir(msg: String) {
        println("Recibido por $nombre: $msg")
    }

    init {
        mediator.agregar(this)
    }
}