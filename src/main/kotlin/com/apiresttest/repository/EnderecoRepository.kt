package com.apiresttest.repository

import com.apiresttest.entity.Endereco
import org.springframework.data.jpa.repository.JpaRepository

interface EnderecoRepository : JpaRepository<Endereco, Long> {
}
