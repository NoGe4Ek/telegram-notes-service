package org.drinkless.features

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.drinkless.tdlib.example.Example.setup

val PHONE_NUMBER = "phone"
val CODE = "code"
val PASSWORD = "password"

fun Application.configureAuthRouting() {
    routing {
        get("/auth") {
            call.respondText("Auth success")
        }
    }
}