package com.github.hugovallada.completablefuturedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class CompletablefuturedemoApplication

fun main(args: Array<String>) {
    runApplication<CompletablefuturedemoApplication>(*args)
}
