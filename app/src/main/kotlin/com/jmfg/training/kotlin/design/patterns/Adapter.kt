package com.jmfg.training.kotlin.design.patterns

import kotlin.random.Random

data class DisplayData(val index: Int, val datos: String)

class DataDisplay {
    fun display(data: DisplayData) {
        println("Data ${data.index} ${data.datos}")
    }
}

data class DbData(val pos: Int, val cantidad: Int)

object DbGenerator {
    fun generar() = listOf(
        DbData(1, Random.nextInt()),
        DbData(Random.nextInt(), 2),
        DbData(3, Random.nextInt()),
    )
}

interface DbDataConverter {
    fun convertir(lista: List<DbData>): List<DisplayData>
}

class DisplayDataAdapter(private val display: DataDisplay) : DbDataConverter {
    override fun convertir(lista: List<DbData>): List<DisplayData> {
        return lista.map {
            val data = DisplayData(it.pos, it.cantidad.toString())
            display.display(data)
            data
        }
    }
}