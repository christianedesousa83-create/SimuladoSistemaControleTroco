# Atividade Prática: Sistema de Controle de Troco - Padaria do Sr. Paiva

Este repositório contém o enunciado e a resolução da atividade prática de programação em Java, focada em lógica de programação, estruturas de controle e cálculos aritméticos.

## 📖 Contexto e Motivação

> "A nota de R$ 200, lançada em 2020, é pouco vista hoje em dia..." 
> — *Fonte: R7 Economia (26/04/2026)*

Com o aumento da circulação de cédulas de diversos valores, o **Senhor Paiva**, dono de uma nova padaria, decidiu modernizar seu sistema de caixa. Ele precisa de uma solução em **Java** que auxilie no cálculo exato do troco, minimizando erros humanos e otimizando a entrega das cédulas.

---

## 🚀 Desafio

Sua missão é desenvolver um programa em Java que solicite os dados da compra, valide o pagamento e calcule a menor quantidade possível de cédulas para o troco, considerando inclusive a nota de **R$ 200,00**.

### 📋 Requisitos do Sistema

| Código | Tipo | Descrição |
| :--- | :--- | :--- |
| **Req01** | Entrada | Solicitar o nome do cliente. |
| **Req02** | Entrada | Solicitar o valor total da compra. |
| **Req03** | Entrada | Solicitar o valor pago pelo cliente. |
| **Req04** | Processamento | Calcular o troco total. |
| **Req05** | Processamento | Calcular a quantidade de cada nota (200, 100, 50, 20, 10, 5, 2, 1). |
| **Req06** | Validação | Validar se o valor pago é suficiente para a compra. |
| **Req07** | Saída | Imprimir o nome do cliente. |
| **Req08** | Saída | Imprimir o valor total da compra. |
| **Req09** | Saída | Imprimir o valor pago. |
| **Req10** | Saída | Exibir erro se o valor for insuficiente ou listar as notas se aceitável. |
| **Req11** | Qualidade | O código deve ser desenvolvido estritamente em **Java**. |
| **Req12** | Qualidade | Versionamento obrigatório no **GitHub**. |

---

## 🧪 Casos de Teste

Utilize os exemplos abaixo para validar sua lógica antes da entrega final:

### Teste 1: Fluxo Padrão (Troco Correto)
- **Entradas:** Nome: `José` | Compra: `25.00` | Pago: `200.00`
- **Saída Esperada:**
  - Troco: `175.00`
  - Notas: `1x R$100, 1x R$50, 1x R$20, 1x R$5`.

### Teste 2: Fluxo de Exceção (Valor Insuficiente)
- **Entradas:** Nome: `Ronaldo` | Compra: `150.00` | Pago: `50.00`
- **Saída Esperada:** `Valor insuficiente para realizar suas compras!`

---

## 📊 Critérios de Avaliação

A pontuação total é distribuída conforme o cumprimento dos requisitos:

| Requisito | Pontos | Requisito | Pontos |
| :--- | :--- | :--- | :--- |
| Req01 a Req04 | 2.0 cada | Req10 | 2.0 |
| **Req05 (Lógica)** | **6.0** | Req11 (Java) | 3.0 |
| Req06 a Req09 | 2.0 cada | Req12 (Git) | 3.0 |

---

## ⚠️ Instruções para Entrega

1. Certifique-se de que o repositório no GitHub está configurado como **PÚBLICO**.
2. O código deve ser legível e seguir as convenções da linguagem Java (CamelCase, etc).
3. Envie o link do repositório através da plataforma indicada pelo professor.

**Boa sorte, dev!**
