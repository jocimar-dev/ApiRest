package com.apiresttest.service

import com.apiresttest.client.ViaCepClient
import com.apiresttest.entity.Endereco
import com.apiresttest.repository.EnderecoRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class EnderecoService(private val client: ViaCepClient, private val repository: EnderecoRepository) {

    @Transactional
     fun buscarESalvarEnderecoPorCep(cep: String): Endereco {
        val response= client.enderecoPor(cep)
        val endereco = Endereco(
            cep = response.cep,
            logradouro = response.logradouro,
            // outros campos
            complemento = response.complemento,
            bairro = response.bairro,
            localidade = response.localidade,
            uf = response.uf,
            ibge = response.ibge,
            gia = response.gia,
            ddd = response.ddd,
            siafi = response.siafi

        )
        return repository.save(endereco)
    }
}