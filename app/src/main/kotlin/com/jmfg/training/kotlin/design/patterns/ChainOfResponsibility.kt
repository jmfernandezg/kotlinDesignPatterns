package com.jmfg.training.kotlin.design.patterns

interface HandleChain {
    fun addHeader(header: String): String
}

class AuthHeader(val token: String?, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = """ 
            $header
            Authorization: $token
        """.trimIndent().let {
        next?.addHeader(it) ?: it
    }
}

class ContentTypeHeader(val contentType: String, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = """ 
            $header
            ContentType: $contentType
        """.trimIndent().let {
        next?.addHeader(it) ?: it
    }
}

class BodyTypeHeader(val body: String, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = """ 
            $header
            Body: $body
        """.trimIndent().let {
        next?.addHeader(it) ?: it
    }
}