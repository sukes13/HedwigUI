package be.sukes.hedwigUI

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun main(args: Array<String>) = io.ktor.server.jetty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    routing {
        singlePageApplication {
            react("hedwig-react/build")
        }
    }
}