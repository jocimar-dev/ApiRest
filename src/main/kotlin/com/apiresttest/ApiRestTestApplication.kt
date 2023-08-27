package com.apiresttest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ApiRestTestApplication

fun main(args: Array<String>) {
    runApplication<ApiRestTestApplication>(*args)
}
