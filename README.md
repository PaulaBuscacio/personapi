# Projeto desenvolvido durante bootcamp da Digital Innovation One
 Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot

### Etapas de criação do projeto

* Setup inicial de projeto com o Spring Boot Initialzr
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários (utilizando-se de Mockito e JUnit) para validação das funcionalidades com o alcance de 80% de cobertura.
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```


## verbos Http e Endpoints utilizados:
### GET:
Visualizar todas as pessoas
```
http://localhost:8086/api/v1/people
```
Buscar uma pessoa por id
```
http://localhost:8086/api/v1/people/{id}
```

### POST
Cadastrar uma pessoa
```
http://localhost:8086/api/v1/people
```

### PUT
Atualizar um cadastro por id
```
http://localhost:8086/api/v1/people/{id}
```

### DELETE
Apagar um registro com base na id
```
http://localhost:8086/api/v1/people/{id}
```


Requisitos necessários para a realização do projeto

* Java 11 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Postman para testar os endpoints e métodos da aplicação
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links bem bacanas, sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)


