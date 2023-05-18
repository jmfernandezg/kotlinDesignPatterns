package com.jmfg.training.kotlin.design.patterns

interface Elemento {
    fun <R> accept(visitor: Reporte<R>): R
}

interface Reporte<out R> {
    fun visit(contract: FixedContract): R
    fun visit(contract: SupportContract): R
    fun visit(contract: TimeContract): R
}

class FixedContract(val costoAnual: Long) : Elemento {
    override fun <R> accept(visitor: Reporte<R>) = visitor.visit(this)
}

class SupportContract(val costoMensual: Long) : Elemento {
    override fun <R> accept(visitor: Reporte<R>) = visitor.visit(this)
}

class TimeContract(val costoHora: Long, val horas: Int) : Elemento {
    override fun <R> accept(visitor: Reporte<R>) = visitor.visit(this)
}

class ReporteMensual : Reporte<Long> {
    override fun visit(contract: FixedContract) = contract.costoAnual / 12
    override fun visit(contract: SupportContract) = contract.costoMensual

    override fun visit(contract: TimeContract) = contract.costoHora * contract.horas
}

class ReporteAnual : Reporte<Long> {
    override fun visit(contract: FixedContract) = contract.costoAnual
    override fun visit(contract: SupportContract) = contract.costoMensual * 12
    override fun visit(contract: TimeContract) = contract.costoHora * contract.horas

}