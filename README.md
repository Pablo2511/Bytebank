#                                                     Byte Bank - Projeto de Banco Virtual
Este é um projeto que visa criar um banco virtual em Java, conhecido como "Byte Bank". Ao desenvolver o Byte Bank, apliquei uma série de conceitos fundamentais da programação orientada a objetos, incluindo <em>classes, métodos, herança e polimorfismo</em>. Além disso, este projeto serviu como um ambiente para aprofundar meus conhecimentos em programação, seguindo as melhores práticas.

## Conceitos-Chave
Aqui, vou explicar em detalhes os principais conceitos da programação orientada a objetos aplicados no projeto Byte Bank.

## Orientação a Objetos
A orientação a objetos é um paradigma de programação que se baseia na ideia de que tudo no programa é representado por objetos. No projeto Byte Bank, essa abordagem nos permite modelar o banco como um conjunto de objetos que interagem entre si. Algumas das características da orientação a objetos incluem:

<h3>Classe:</h3> Uma classe é um modelo para criar objetos. No projeto, classes como ContaBancaria e Cliente são usadas para criar objetos que representam contas bancárias e clientes.

<h3>Objeto:</h3> Um objeto é uma instância de uma classe. Por exemplo, quando criamos uma conta bancária usando a classe ContaBancaria, estamos criando um objeto dessa classe.

### Classes
As classes são as estruturas básicas da programação orientada a objetos. No projeto Byte Bank, temos várias classes que desempenham papéis diferentes, como Conta, Cliente, CriaConta, etc. As classes servem como modelos para criar objetos com atributos (dados) e métodos (comportamento).

### Métodos
Métodos são funções definidas dentro de uma classe que descrevem o comportamento dos objetos dessa classe. No Byte Bank, os métodos são usados para realizar operações como depósito, saque e transferência em contas bancárias.

### Herança
A herança é um conceito que permite criar novas classes (classes derivadas) com base em classes existentes (classes base). No projeto Byte Bank, podemos ter uma classe base chamada ContaBancaria e criar subclasses como ContaCorrente e ContaPoupanca. Isso nos permite reutilizar código comum e estender funcionalidades específicas nas subclasses.

### Polimorfismo
O polimorfismo é um conceito que permite que objetos de diferentes classes sejam tratados de maneira uniforme. No projeto Byte Bank, podemos ter uma lista de contas bancárias que incluem tanto ContaCorrente quanto ContaPoupanca, e podemos chamar métodos como <b>calcularSaldo()</b> em todas elas, independentemente do tipo específico de conta.
