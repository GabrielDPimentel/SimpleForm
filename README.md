Cadastro de Aprovados em Concursos Públicos

Aplicação desenvolvida como teste prático para vaga de desenvolvedor.

O sistema permite o cadastro de pessoas aprovadas em concursos públicos, incluindo envio de imagem, com persistência em banco de dados MySQL.

Tecnologias Utilizadas

Java 21

Spring Boot

Spring Data JPA

MySQL

HTML5

CSS3

JavaScript (Fetch API)

Ngrok

Funcionalidades

Cadastro de aprovados em concursos públicos

Upload de imagem

Persistência dos dados no MySQL

Frontend integrado ao backend (Spring Boot)

API REST simples para envio dos dados

Estrutura do Projeto
backend/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.exemplo.aprovados
│       │       ├── controller
│       │       ├── model
│       │       ├── repository
│       │       └── service
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── script.js
│           │   └── style.css
│           └── application.properties
├── pom.xml
└── README.md

Como Executar o Projeto
1. Criar o banco de dados

No MySQL Workbench, execute:

CREATE DATABASE aprovados_db;

2. Configurar o banco no Spring Boot

No arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/aprovados_db
spring.datasource.username=root
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB

3. Executar a aplicação

Rodar pela IDE (IntelliJ / Eclipse) ou via terminal:

mvn spring-boot:run


A aplicação ficará disponível em:

http://localhost:8080

4. Acessar o Frontend

O frontend é servido diretamente pelo backend Spring Boot:

http://localhost:8080/

Endpoint da API
Cadastro de aprovado

POST /aprovados

Campos enviados via multipart/form-data:

nome

email

telefone

concursos

imagem

Expondo a Aplicação com Ngrok

Com o backend rodando localmente:

ngrok http 8080


O link gerado pelo ngrok permite acesso externo à aplicação.

Exemplo:

https://xxxxxx.ngrok-free.app

Observações

O frontend consome a API via JavaScript utilizando Fetch API

O banco de dados é atualizado automaticamente via JPA (ddl-auto=update)

Projeto desenvolvido com foco em simplicidade e funcionamento
