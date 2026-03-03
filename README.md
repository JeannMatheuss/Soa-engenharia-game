# 🎮 Engenharia Game - Projeto SOA

Projeto desenvolvido para a disciplina de **Arquitetura Orientada a Serviços (SOA) e Web Services** da FIAP.

## 📋 Descrição

O **Engenharia Game** é um sistema de jogos onde o jogador atua como um engenheiro e precisa completar missões técnicas. Cada missão possui nível de dificuldade, gera pontuação e pode ser validada por regras diferentes.

### Objetivo do Projeto
- Completar partes do sistema
- Identificar a arquitetura utilizada
- Corrigir problemas arquiteturais
- Preparar o sistema para evolução SOA
- Desenhar a arquitetura final

> *"Uma pessoa engenheira não constrói para o presente. Ela projeta para o que ainda vai acontecer."*

---

## 🏗️ Arquitetura

### Qual arquitetura está sendo usada?
Estamos utilizando uma **Arquitetura em Camadas (Layered Architecture)** com **Design Orientado a Objetos**.

### Características Arquiteturais

| Característica | Status | Descrição |
| :--- | :---: | :--- |
| **Monolítica** | ✅ Sim | Todas as classes estão no mesmo projeto, mesmo pacote base e compiladas juntas. |
| **Em Camadas** | ✅ Sim | Separação clara: UI, Application, Domain, Service. |
| **Orientada a Objetos** | ✅ Sim | Uso de classes, interfaces, encapsulamento e polimorfismo. |
| **Orientada a Serviços (SOA)** | 🔄 Preparado | Estrutura modular que permite evolução para WebServices SOAP. |

## Estrutura de Pacotes
```text
br.com.fiap.engenhariagame
├── application/
│   └── GameEngine.java
├── domain/
│   ├── Mission.java
│   └── Player.java
├── service/
│   ├── MissionValidatorService.java (interface)
│   ├── BasicMissionValidatorService.java
│   ├── AdvancedMissionValidatorService.java
│   └── ScoreService.java
└── ui/
    └── (vazio - reservado para interface do usuário)
```

## 📐 Diagrama de Arquitetura
<img width="1105" height="611" alt="image" src="https://github.com/user-attachments/assets/264ff489-2c2a-449e-a502-914fc5bfb58c" />

## 🛠️ Tecnologias Utilizadas
- Linguagem: Java
- Padrão de Projeto: Injeção de Dependência (Constructor Injection)
- Princípios SOLID: Aplicados (especialmente Inversão de Dependência)

## 🚀 Como Executar

### Pré-requisitos
*   Java JDK 8 ou superior
*   Git instalado

### Passos para rodar a aplicação
1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/JeannMatheuss/Soa-engenharia-game.git
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd Soa-engenharia-game
    ```

3.  **Compile os arquivos Java:**
    ```bash
    javac -d out $(find . -name "*.java")
    ```

4.  **Execute o motor do jogo:**
    ```bash
    java -cp out br.com.fiap.engenhariagame.application.GameEngine
    ```

---

## 📝 Evolução Futura (SOA)
O sistema foi preparado estrategicamente para a evolução rumo ao modelo SOA. No futuro, os seguintes serviços serão desacoplados e expostos como **WebServices (SOAP/REST)**:

*   **MissionValidatorService:** Validação remota de missões técnicas.
*   **ScoreService:** Serviço centralizado para cálculo e persistência de ranking e pontuação.

Essa abordagem permitirá que o `GameEngine` consuma inteligência de negócios distribuída, facilitando a manutenção e a integração com outras plataformas.

---

## 👨‍💻 Desenvolvedor
*   **Nome:** Jean Matheus Mohamed de Oliveira
*   **RM:** RM555519
*   **Turma:** 3ESPW
*   **LinkedIn:** [Jean Matheus](https://www.linkedin.com/in/jeanmatheusmoliveira/)
*   **GitHub:** [@JeannMatheuss](https://github.com/JeannMatheuss)

---
*Este projeto faz parte do currículo acadêmico da FIAP - Faculdade de Informática e Administração Paulista, proposto pelo professor Salatiel Marinho*
