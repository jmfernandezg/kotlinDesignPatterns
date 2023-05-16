package com.jmfg.training.kotlin.design.patterns

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class AbstractFactoryTest {
    @Test
    fun testAbstractFactory() {
        val factory = DataSourceFactory.fabrica<DbDataSource>()
        val dataSource = factory.crearDataSource()

        println("Clase creada ${dataSource.javaClass.kotlin.simpleName}")

        assertTrue(dataSource is DbDataSource)
    }


}
