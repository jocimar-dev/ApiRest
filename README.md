# Projeto de Consulta de Endereços via API ViaCEP

Este projeto é uma aplicação Spring Boot que utiliza Kotlin, Spring Data JPA, H2 Database, e Feign para consultar e armazenar endereços a partir de códigos postais (CEPs) através da API ViaCEP.

## Tabela de Conteúdo

- [Requisitos](#requisitos)
- [Configuração Inicial](#configuração-inicial)
    - [Dependências](#dependências)
    - [Configuração do Banco H2](#configuração-do-banco-h2)
- [Execução](#execução)
- [Como Usar](#como-usar)
- [Estrutura do Código](#estrutura-do-código)
- [Testes](#testes)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Requisitos

- JDK 11 ou superior
- Gradle

## Configuração Inicial

### Dependências

Para adicionar as dependências do projeto, insira as seguintes linhas no seu arquivo `build.gradle`:

`groovy
dependencies {
implementation 'org.springframework.boot:spring-boot-starter-web'
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'
implementation 'com.h2database:h2'
}`


### Configuração do Banco H2

Insira as seguintes linhas no seu arquivo `application.properties`:

`properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
`

## Execução

Para executar o projeto, navegue até a raiz do diretório e execute o seguinte comando:


`./gradlew bootRun`


## Como Usar

Após a execução, a API estará disponível em `http://localhost:8080`.

- Para buscar e armazenar um endereço com base em um CEP, utilize:


`  GET /endereco/{cep}`


## Estrutura do Código

- `ViaCepClient`: Cliente Feign para consumo da API do ViaCEP.
- `Endereco`: Entidade que representa um endereço no banco de dados.
- `EnderecoRepository`: Repositório JPA para operações com a entidade `Endereco`.
- `EnderecoService`: Serviço para buscar e armazenar endereços.
- `EnderecoController`: Controlador para expor as funcionalidades via API.

## Testes

Para executar os testes, utilize o comando:


`./gradlew test`


## Contribuições

Contribuições são bem-vindas! Por favor, abra uma issue ou envie um Pull Request.
