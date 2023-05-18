package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class VisitorTest {

    @Test
    fun `Probar Visitor`() {
        val proyectoFix = FixedContract(100)
        val proyectoTime = TimeContract(200, 40)
        val proyectoSupport = SupportContract(400)

        val proyectos = listOf(proyectoFix, proyectoTime, proyectoSupport)

        val mensual = ReporteMensual()
        val anual = ReporteAnual()
        val costoMensual = proyectos.sumOf { it.accept(mensual) }
        println("Costo Mensual $costoMensual")
        assertEquals(8408, costoMensual)

        val costoAnual = proyectos.sumOf { it.accept(anual) }
        println("Costo Anual $costoAnual")
        assertEquals(12900, costoAnual)


    }
}