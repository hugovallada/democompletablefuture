package com.github.hugovallada.completablefuturedemo

import org.springframework.http.ResponseEntity
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.CompletableFuture

@RestController
class ControllerCF(private val service: Service) {

    @PostMapping
    @Async
    fun execute(): ResponseEntity<Any> {
        CompletableFuture.runAsync {
            service.execute()
        }
        return ResponseEntity.accepted().build()
    }
}


@Component
class Service {
    fun execute() {
        println("Executing...")
        Thread.sleep(10000)
        println("Finalizado")
    }
}