package org.drinkless.features

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.drinkless.tdlib.example.Example.message
import org.drinkless.tdlib.example.Example.setup

const val CHAT_ID = "chatId"

fun Application.configureMessageRouting() {
    routing {
        get("/glm") {
            val chatId = call.request.queryParameters[CHAT_ID]
            if (chatId == "238472532")
                call.respond(HttpStatusCode.BadRequest, "asd")
            else
                setup(chatId)
            call.respondText(message)
        }
    }
}