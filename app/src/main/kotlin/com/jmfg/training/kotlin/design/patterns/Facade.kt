package com.jmfg.training.kotlin.design.patterns

class AlmacenamientoComplejo(private val path: String) {
    private val cache: HashMap<String, String>

    init {
        println("Leyendo datos de ${path}")
        cache = HashMap()
    }

    fun save(llave: String, valor: String) {
        cache[llave] = valor
    }

    fun read(llave: String) = cache[llave] ?: ""

    fun commit() = println("Almacenando cache a archivo en $path")
}

data class Usuario(val username: String)

class UserRepo {
    private val preferencias = AlmacenamientoComplejo("/data/default.prefs")

    fun guardar(usuario: Usuario) {
        preferencias.save("USER", usuario.username)
        preferencias.commit()
    }

    fun find() = Usuario(preferencias.read("USER"))
}