package com.apiresttest.client

import com.apiresttest.model.EnderecoResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "viaCepClient", url = "https://viacep.com.br/ws")
fun interface ViaCepClient {

    @GetMapping("/{cep}/json/")
    fun enderecoPor(@PathVariable cep: String): EnderecoResponse
}
