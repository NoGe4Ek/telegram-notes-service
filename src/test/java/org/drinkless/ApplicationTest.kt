package org.drinkless

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.drinkless.features.configureMessageRouting
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApplicationTest {
    @Test
    fun testTextMessageSuccess() = testApplication {

        application {
            configureMessageRouting()
        }

        val response = client.get("/glm?chatId=1250175192")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Лиля: Вот , да \uD83D\uDE09", response.bodyAsText())
    }

    @Test
    fun testUndefinedChatError() = testApplication {

        application {
            configureMessageRouting()
        }

        val response = client.get("/glm?chatId=238472532")
        assertEquals(HttpStatusCode.BadRequest, response.status)
    }
}