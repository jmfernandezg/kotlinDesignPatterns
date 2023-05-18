package com.jmfg.training.kotlin.design.patterns

open class Equipo(
    open val precio: Int,
    val nombre: String
)

open class Composite(nombre: String) : Equipo(0, nombre) {
    private val equipos = mutableListOf<Equipo>()

    override val precio
        get() = equipos.sumOf { it.precio }

    fun add(equipo: Equipo) = apply { equipos.add(equipo) }

}

class Computador : Composite("PC")

class Procesador : Equipo(1000, "CPU")
class DiscoDuro : Equipo(2000, "HDD")

class Memoria : Composite("Memoria")
class RAM : Equipo(3000, "RAM")
class ROM : Equipo(3500, "ROM")

