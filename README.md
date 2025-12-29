# Cadastro de Aprovados

Aplicação simples desenvolvida como teste técnico para cadastro de aprovados em concursos públicos, com envio de imagem e persistência em banco de dados MySQL.

## Tecnologias
Java (Spring Boot), MySQL, HTML, CSS, JavaScript e Ngrok.

## Funcionalidade
Cadastro de nome, e-mail, telefone e concursos aprovados, com upload de imagem e salvamento dos dados no banco.

## Execução
Criar o banco de dados com o comando CREATE DATABASE aprovados_db;. 
Configurar o arquivo application.properties com a URL jdbc:mysql://localhost:3306/aprovados_db, usuário root, senha correspondente e spring.jpa.hibernate.ddl-auto=update. 
Executar o projeto com mvn spring-boot:run e acessar pelo navegador em http://localhost:8080.

## API
Endpoint POST /aprovados recebendo os campos nome, email, telefone, concursos e imagem via multipart/form-data.

## Acesso Externo
Com a aplicação rodando, executar ngrok http 8080 e utilizar o link gerado para acesso externo.

## Observação
Projeto desenvolvido como teste prático para processo seletivo.
