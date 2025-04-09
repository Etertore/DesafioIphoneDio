# Desafio do bootcamp Dio para diagramação de um iphone.

 Modelagem e Diagramação de Funcionalidades do iPhone

## Visão Geral

Este projeto tem como objetivo demonstrar a modelagem e diagramação das funcionalidades básicas de um iPhone, utilizando os princípios da Programação Orientada a Objetos (POO) e interfaces em Java. O foco é representar como diferentes componentes (Reprodutor Musical, Aparelho Telefônico e Navegador na Internet) podem ser abstraídos e implementados em uma única classe `Iphone`.

## Estrutura do Projeto

O projeto utiliza interfaces para definir os contratos de cada funcionalidade principal:

1.  **`PlayerMusic`**: Define as ações relacionadas à reprodução de música.
    *   `playMusic()`: Inicia a reprodução de uma música.
    *   `pauseMusic()`: Pausa a música atual.
    *   `selectMusic()`: Permite a seleção de uma música.

2.  **`Telephone`**: Define as ações relacionadas às funcionalidades de telefonia.
    *   `call()`: Realiza uma chamada telefônica.
    *   `answer()`: Atende a uma chamada recebida.
    *   `startVoiceMail()`: Inicia o correio de voz.

3.  **`Browser`**: Define as ações relacionadas à navegação na internet.
    *   `showPage()`: Exibe uma página da web.
    *   `addNewTab()`: Abre uma nova aba no navegador.
    *   `refreshPage()`: Atualiza a página atual.

A classe `Iphone` implementa essas três interfaces, centralizando todas as funcionalidades em um único objeto, simulando o comportamento multifuncional do dispositivo.


## Diagrama UML

```mermaid
classDiagram
    direction TD

    class Browser {
        <<interface>>
        +showPage()
        +addNewTab()
        +refreshPage()
    }

    class PlayerMusic {
        <<interface>>
        +playMusic()
        +pauseMusic()
        +selectMusic()
    }

    class Telephone {
        <<interface>>
        +call()
        +answer()
        +startVoiceMail()
    }

    class Iphone {
        +showPage()
        +addNewTab()
        +refreshPage()
        +playMusic()
        +pauseMusic()
        +selectMusic()
        +call()
        +answer()
        +startVoiceMail()
    }

    Iphone ..|> Browser : implements
    Iphone ..|> PlayerMusic : implements
    Iphone ..|> Telephone : implements






