package com.jmfg.training.kotlin.design.patterns

interface Dispositivo {
    var volumen: Int
    fun getName(): String
}

class Radio : Dispositivo {
    override var volumen: Int = 0
    override fun getName() = "RADIO"
}

class TV : Dispositivo {
    override var volumen: Int = 0
    override fun getName() = "TV"

}

interface Remoto {
    fun volumenArriba()
    fun volumenAbajo()
}

class ControlRemoto(private val dispositivo: Dispositivo) : Remoto {
    override fun volumenArriba() {
        dispositivo.volumen++
        println("Dispositivo ${dispositivo.getName()} volumen ${dispositivo.volumen} $ ")
    }

    override fun volumenAbajo() {
        dispositivo.volumen--
        println("Dispositivo ${dispositivo.getName()} volumen ${dispositivo.volumen} $ ")
    }

}