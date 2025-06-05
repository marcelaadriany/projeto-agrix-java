# 🌾 Agrix - Sistema de Gerenciamento de Fazendas

Projeto desenvolvido durante o curso de Java da [Trybe](https://www.betrybe.com/), com o objetivo de aplicar conceitos avançados de desenvolvimento backend utilizando o ecossistema Spring. O Agrix é um sistema que permite a gestão e o monitoramento de fazendas, facilitando o controle de plantações, fertilizantes e usuários com diferentes níveis de acesso.

---

## 🛠 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MySQL
- H2 Database, JUnit e Mockito (para testes)
- Maven
- Docker

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/marcelaadriany/projeto-agrix-java

2. Instale as dependências:
   ```bash
   mvn clean install

3. Rode a aplicação:
   ```bash
   mvn spring-boot:run

4. Acesse a aplicação:
   API: http://localhost:8080

---

## 🧱 Arquitetura
O projeto foi desenvolvido com base em uma arquitetura em camadas, seguindo boas práticas do ecossistema Spring e princípios de separação de responsabilidades. A estrutura favorece a escalabilidade, testabilidade e manutenção do sistema. Camadas do projeto:

- Controller: Responsável por receber as requisições HTTP e retornar respostas apropriadas.

- Service: Contém a lógica de negócio.

- Repository: Comunicação com o banco de dados usando Spring Data JPA.

- Entity: Define os modelos de dados da aplicação com base nas regras do JPA.

- DTO (Data Transfer Object): Transporta dados entre as camadas de forma controlada.

- Security: Gerencia autenticação e autorização com JWT.

- Exception: Tratamento global de exceções com @ControllerAdvice.

---

## 🛠️ Funcionalidades Implementadas
- Cadastro e listagem de fazendas.

- Cadastro, listagem e associação de culturas a fazendas.

- Cadastro de fertilizantes e vinculação com culturas.

- Sistema de autenticação e autorização com níveis de acesso.

- Validação de dados de entrada.

- Tratamento centralizado de exceções.

---

## 👩‍💻 Créditos
Este projeto foi proposto pela [Trybe](https://www.betrybe.com/)

---

<p align="center">Desenvolvido com 💚 por <a href="https://github.com/marcelaadriany" target="_blank">Marcela Andrade</a></p>

