package org.drinkless

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.drinkless.features.configureAuthRouting
import org.drinkless.features.configureMessageRouting
import org.drinkless.plugins.configureSerialization
import org.drinkless.tdlib.example.Example.setup

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureMessageRouting()
        configureAuthRouting()
    }.start(wait = true)
}