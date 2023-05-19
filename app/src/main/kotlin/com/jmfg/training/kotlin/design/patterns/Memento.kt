package com.jmfg.training.kotlin.design.patterns

data class Memento(val estado: String)

class Originador(var estado: String) {
    fun crearMemento() = Memento(estado)
    fun restauraMemento(memento: Memento) {
        estado = memento.estado
    }
}

class Caretaker {
    private val mementos = arrayListOf<Memento>()
    fun guardar(estado: Memento) = mementos.add(estado)
    fun restaurar(indice: Int) = mementos[indice]
}