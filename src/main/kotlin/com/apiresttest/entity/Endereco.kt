package com.apiresttest.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
data class Endereco(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
) {
    constructor() : this(
        cep = "",
        logradouro = "",
        complemento = "",
        bairro = "",
        localidade = "",
        uf = "",
        ibge = "",
        gia = "",
        ddd = "",
        siafi = ""
    )
}
