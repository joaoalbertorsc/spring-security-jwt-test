---
# Spring Boot JWT Authentication

Este projeto demonstra como configurar autenticação e autorização usando JWT (JSON Web Tokens) com Spring Boot e Spring Security.
Ele fornece uma implementação básica de segurança JWT, onde endpoints estão protegidos e requerem autenticação para acesso. 
Um exemplo de usuário estático é usado para facilitar a compreensão, mas a estrutura pode ser facilmente adaptada para se conectar a um banco de dados em aplicações reais.

## Funcionalidades

1. **Configuração de Projeto com Spring Security**:
   - Criação de um projeto Spring Boot com Spring Security para autenticação baseada em JWT.
   - Definição de endpoints protegidos que exigem autenticação via JWT.

2. **Serviço de Usuário Personalizado**:
   - Customização de um serviço de detalhes de usuário para carregar usuários por nome de usuário.
   - Configuração de um usuário estático para demonstração.

3. **Autenticação Baseada em Credenciais**:
   - Implementação de autenticação básica por nome de usuário e senha.
   - Integração do Spring Security para usar detalhes de usuário fornecidos por um serviço personalizado.
   - Adição de codificador de senha para tratar senhas recebidas.

4. **Geração e Validação de JWT**:
   - Criação de uma classe utilitária para gerar e validar JWTs.
   - Métodos para extração de informações do token, incluindo nome de usuário, data de expiração e validação de token.

5. **Implementação do Endpoint de Autenticação**:
   - Criação de um endpoint de autenticação para lidar com o login e fornecer um JWT em caso de sucesso.
   - Configuração de Spring Security para permitir acesso não autenticado ao endpoint `/authenticate`.

6. **Filtro de Autenticação JWT**:
   - Implementação de um filtro personalizado para interceptar requisições e validar o JWT presente no cabeçalho de autorização.
   - Extração do token JWT, validação e definição de autenticação no contexto de segurança do Spring.

7. **Configuração Stateless**:
   - Configuração do Spring Security para modo `stateless`, garantindo que o JWT seja validado em cada requisição, em vez de usar sessões.

## Requisitos

- **Java 11+**
- **Spring Boot**
- **Dependências no `pom.xml`**:
  - Spring Security
  - JWT (JSON Web Token)
  - Jax B API

## Como Usar

1. **Clone o Repositório**:
   ```bash
   git clone https://github.com/joaoalbertorsc/spring-security-jwt-test
   cd spring-security-jwt-test
   ```

2. **Configure as Dependências**:
   - Certifique-se de que as dependências do Spring Security e JWT estão configuradas no `pom.xml`.

3. **Inicie a Aplicação**:
   - Execute a aplicação com o comando:
     ```bash
     mvn spring-boot:run
     ```

4. **Autenticação**:
   - Envie uma requisição `POST` para o endpoint `/authenticate` com nome de usuário e senha para obter o JWT.
   - Use o JWT retornado para autenticar suas requisições aos endpoints protegidos.

5. **Teste o Endpoint Protegido**:
   - Acesse endpoints protegidos usando o JWT no cabeçalho de autorização.

## Estrutura do Projeto

- **SecurityConfig**: Configura as regras de segurança e os filtros JWT.
- **JwtUtil**: Classe para geração e validação de JWTs.
- **JwtRequestFilter**: Filtro para interceptar requisições e validar tokens.
- **UserDetailsServiceImpl**: Serviço para carregar detalhes do usuário.
- **Endpoints**:
  - `/authenticate`: Endpoint público para geração de JWT.
  - Endpoints protegidos: Acessíveis apenas com um JWT válido.

## Observações

Este projeto usa um usuário estático para demonstração. 
Para uso em produção, recomenda-se integrar a aplicação com um banco de dados, e configurar senhas com hashing adequado.
---
