package org.drinkless.features

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.drinkless.tdlib.example.Example.message
import org.drinkless.tdlib.example.Example.setup

fun Application.configureMessageRouting() {
    routing {
        get("/glm") {
            setup(call.request.queryParameters["chatId"])
            call.respondText(message)
        }
    }
}