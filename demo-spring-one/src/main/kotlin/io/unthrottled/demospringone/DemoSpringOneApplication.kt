package io.unthrottled.demospringone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSpringOneApplication

fun main(args: Array<String>) {
    runApplication<DemoSpringOneApplication>(*args)
}
