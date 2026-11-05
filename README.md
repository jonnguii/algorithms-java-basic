# 📌 Algoritmos e Desafios de Código em Java

Repositório dedicado ao estudo prático de **Lógica de Programação** e **Estruturas Fundamentais** em Java. Reúne exercícios do curso de Algoritmos do professor **Gustavo Guanabara (Curso em Vídeo)** e desafios complementares de plataformas como a **DIO (Digital Innovation One)**.

**Objetivo:** Reforçar a base em algoritmos, raciocínio lógico e resolução de problemas práticos com Java.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java (JDK 17+)
- **IDE:** IntelliJ IDEA / VS Code
- **Build / Execução:** `javac` / `java`

---

## 📂 Estrutura do Repositório

```text
algorithms-java-basic/
├── .gitignore
├── README.md
└── src/
    ├── cursoemvideo/                         # Curso de Algoritmos (Guanabara)
    │   ├── math/                             # Desafios matemáticos e operações básicas
    │   │   ├── Impars.java
    │   │   ├── MostValues.java
    │   │   └── SumInt.java
    │   ├── procedures/                       # Procedimentos e funções auxiliares
    │   │   ├── Fibonnaci.java
    │   │   ├── OddOrEven.java
    │   │   ├── Sum.java
    │   │   └── WeightDetector.java
    │   └── repetition/                       # Estruturas de repetição (for, while, do-while)
    │       ├── challenges/                   # Desafios de repetição
    │       ├── conversor/                    # Conversores (ex: moedas)
    │       ├── repetition/                   # Exemplos práticos de contagem, primos, etc.
    │       └── util/                         # Utilitários (somadores, contadores)
    │
    └── challenges/                           # Desafios extras de lógica
        ├── dio_list/                         # Lista sequencial de exercícios de fixação DIO
        │   ├── Ex01 a Ex08                   # Operadores, condicionais e ordenação
        │   ├── utils/Scan.java               # Helper para leitura de dados
        │   └── list.md                       # Enunciados dos exercícios
        └── dio_poo/                          # Exercícios conceituais de POO
            ├── README.md                     # Enunciados dos desafios
            └── Exercicio1.java
```

---

## 🎯 Tópicos Praticados

- [x] Entrada e Saída de Dados (`Scanner`, formatação decimal)
- [x] Operadores Aritméticos, Relacionais e Lógicos
- [x] Estruturas Condicionais (`if`, `else`, `switch`)
- [x] Estruturas de Repetição (`for`, `while`, `do-while`)
- [x] Procedimentos e Funções
- [ ] Vetores e Coleções
- [ ] Matrizes
- [ ] Programação Orientada a Objetos (POO) básica

---

## 🚀 Como Executar

Compile e execute qualquer classe diretamente pelo terminal a partir da raiz do repositório:

```bash
# Compilar todo o projeto
javac $(find src -name "*.java")

# Exemplo: Executar um exercício do Curso em Vídeo
java -cp src cursoemvideo.math.SumInt

# Exemplo: Executar um exercício da DIO
java -cp src challenges.dio_list.Ex01SomaComparacao
```
