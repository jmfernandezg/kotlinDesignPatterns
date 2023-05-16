package com.jmfg.training.kotlin.design.patterns

interface DataSource

class DbDataSource : DataSource

class NetDataSource : DataSource

abstract class DataSourceFactory {
    abstract fun crearDataSource(): DataSource

    companion object {
        inline fun <reified T : DataSource> fabrica(): DataSourceFactory =
            when (T::class) {
                DbDataSource::class -> DatabaseFactory()
                NetDataSource::class -> NetworkFactory()
                else -> throw IllegalArgumentException("no parameter found")
            }
    }
}

class NetworkFactory : DataSourceFactory() {
    override fun crearDataSource(): DataSource = NetDataSource()

}

class DatabaseFactory : DataSourceFactory() {
    override fun crearDataSource() = DbDataSource()

}
