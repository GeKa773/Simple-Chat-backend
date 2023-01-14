package ru.simplechat

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.simplechat.feature.login.configureLoginRouting
import ru.simplechat.feature.register.configureRegisterRouting
import ru.simplechat.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {

    configureRouting()
    configureLoginRouting()
    configureRegisterRouting()

    configureSerialization()
}
