package com.jmfg.training.kotlin.design.patterns

class Componente private constructor(builder: Builder) {
    var param1: String? = ""
    var param2: Boolean? = false
    var param3: Int? = 3

    init {
        param1 = builder.getParam1()
        param2 = builder.getParam2()
        param3 = builder.getParam3()
    }

    class Builder {
        private var param1: String? = null
        private var param2: Boolean? = null
        private var param3: Int? = null

        fun setParam1(param1: String) = apply { this.param1 = param1 }
        fun setParam2(param2: Boolean) = apply { this.param2 = param2 }
        fun setParam3(param3: Int) = apply { this.param3 = param3 }
        fun build() = Componente(this)

        fun getParam1() = param1
        fun getParam2() = param2
        fun getParam3() = param3
    }
}
