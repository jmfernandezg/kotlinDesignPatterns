package com.jmfg.training.kotlin.design.patterns

interface HandleChain {
    fun addHeader(header: String): String
}

class AuthHeader(private val token: String?, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = "$header\nAuthorization: $token".let {
        next?.addHeader(it) ?: it
    }
}

class ContentTypeHeader(val contentType: String, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = "$header\nContentType: $contentType".let {
        next?.addHeader(it) ?: it
    }
}

class BodyTypeHeader(private val body: String, var next: HandleChain? = null) : HandleChain {
    override fun addHeader(header: String) = "$header\nBody: $body".let {
        next?.addHeader(it) ?: it
    }
}