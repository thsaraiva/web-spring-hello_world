package com.developments.tms.hellospringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpringBootApplication

fun main(args: Array<String>) {
    runApplication<HelloSpringBootApplication>(*args)
}
