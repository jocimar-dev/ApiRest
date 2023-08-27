package com.apiresttest

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestApiRestTestApplication

fun main(args: Array<String>) {
    fromApplication<ApiRestTestApplication>().with(TestApiRestTestApplication::class).run(*args)
}
