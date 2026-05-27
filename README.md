# Guild — CRUD de Personagens (estrutura inicial)

> Projeto de exemplo para demonstrar conhecimentos práticos em Java e boas práticas de engenharia de software.

## Visão geral

Este projeto implementa uma aplicação CLI simples que gerencia personagens de uma guilda.
É um exercício focado em criar uma estrutura inicial de CRUD usando Java, Maven e padrões básicos como DAO.

## Tecnologias e ferramentas

- Java (versão alvo do projeto: conforme `pom.xml`)
- Maven (build & dependências)
- Git (controle de versão)

## O que eu aprendi e demonstrei neste projeto

- Organização de projeto Java com Maven.
- Implementação do padrão DAO para separar persistência de lógica de negócio (`PersonagemDAO`).
- Manipulação de coleções (`HashMap`) para armazenamento em memória.
- Entrada/saída via `Scanner` e criação de uma interface de linha de comando simples (`AdminView`).
- Validação de input com expressões regulares e tratamento de exceções para tornar a aplicação mais robusta.
- Boas práticas de programação: responsabilidade única, nomeação clara e modularidade.
- Ciclo de vida do desenvolvimento: escrever código, executar testes e versionar com Git.

## Funcionalidades

- Criar personagem com nome, classe e nível.
- Listar personagens cadastrados.
- Atualizar nível de um personagem por `id`.
- Excluir personagem por `id`.
- Importar um personagem VIP a partir de um payload (simulado).

## Estrutura do projeto

- `src/main/java/com/guild/` — código fonte principal (`Main`, `AdminView`, `Personagem`, `PersonagemDAO`).
- `src/test/java/com/guild/` — testes unitários (se presentes).
- `pom.xml` — gerenciador de dependências e build (Maven).

## Como rodar

Pré-requisitos: `java` e `mvn` instalados.

1. Build e rodar (em linha de comando):

```bash
mvn clean package
java -cp target/classes com.guild.Main
```

2. Executar testes (se existirem):

```bash
mvn test
```

## Possíveis melhorias (sugestões)

- Persistência em arquivo ou banco de dados para manter dados entre execuções.
- Interface gráfica leve (JavaFX/Swing) ou API REST para integração externa.
- Validações mais completas e mensagens de erro localizadas.
- Suporte a logging com `SLF4J`/`Logback` para diagnóstico em produção.

## Contato e repositório

Repositório remoto proposto: https://github.com/luiznascimentodev/crud-estrutura-inicial

Se quiser, posso:

- Subir este projeto para o repositório remoto e confirmar o push.
- Adicionar um `README` mais longo em inglês para recrutadores internacionais.

---
_Feito como exercício prático — pronto para revisão técnica._
