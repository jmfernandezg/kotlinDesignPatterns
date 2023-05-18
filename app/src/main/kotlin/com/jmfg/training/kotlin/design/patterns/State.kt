package com.jmfg.training.kotlin.design.patterns

sealed class State

object UnAuthorized : State()

class Authorized(val username: String) : State()

class Autorizador {
    private var state: State = UnAuthorized

    val isAuthorized = when (state) {
        is Authorized -> true
        UnAuthorized -> false
    }

    val username = when (val state = this.state) {
        is Authorized -> state.username
        UnAuthorized -> "UNKNOWN"
    }

    fun login(username: String) {
        state = Authorized(username)
    }

    fun logout() {
        state = UnAuthorized
    }

    override fun toString() = "Usuario $username esta autorizado? $isAuthorized"
}
