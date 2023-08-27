package com.apiresttest.controller

import com.apiresttest.entity.Endereco
import com.apiresttest.service.EnderecoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EnderecoController(

    @Autowired
    val service: EnderecoService
) {
    @GetMapping("/endereco/{cep}")
    fun buscaEndereco(@PathVariable cep: String): Endereco {
        return service.buscarESalvarEnderecoPorCep(cep)
    }
}
