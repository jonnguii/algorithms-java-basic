# ☕ Desafios de POO - Trilha DIO

Exercícios práticos de modelagem orientada a objetos em Java para exercitar raciocínio de arquitetura, encapsulamento, herança e polimorfismo.

---

## 🎯 Desafio 1: Bilheteria de Cinema

Um cinema precisa modernizar o sistema de venda de ingressos.

### Contexto & Problema:
- Todo ingresso vendido possui valor inicial, nome do filme e tipo de áudio (dublado ou legendado).
- O cinema trabalha com categorias promocionais:
  - **Meia-entrada:** estudantes e beneficiários pagam apenas metade do preço do ingresso.
  - **Ingresso Família:** pacotes para grupos onde o valor final depende da quantidade de pessoas, oferecendo 5% de desconto quando o grupo for maior que 3 pessoas.

### Sua Missão:
- Projete uma hierarquia onde cada tipo de ingresso saiba calcular seu próprio valor final real.
- Evite duplicação de regras e garanta que novas modalidades de ingresso possam ser criadas no futuro sem quebrar o sistema.

---

## 🎯 Desafio 2: Controle de Acesso Corporativo

Um sistema comercial possui diferentes perfis de funcionários acessando a mesma plataforma.

### Contexto & Problema:
- Todo colaborador no sistema precisa ter credenciais de acesso (identificação, e-mail e senha) e operações básicas como autenticação, encerramento de sessão e atualização de cadastro.
- Existem regras rígidas de privilégio por cargo:
  - **Gerente:** possui acesso administrativo total e precisa consultar vendas e emitir relatórios financeiros da equipe.
  - **Vendedor:** não é administrador. Seu foco é registrar novas vendas e acompanhar o total de vendas realizadas por ele.
  - **Atendente:** não é administrador. Opera o caixa da loja, recebendo pagamentos e fechando o caixa do dia.

### Sua Missão:
- Modele a estrutura de classes de modo que comportamentos comuns fiquem centralizados e permissões/ações restritas fiquem isoladas apenas em quem deve executá-las.
- Garanta que um atendente não consiga emitir relatórios e que um vendedor não consiga manipular o caixa.

---

## 🎯 Desafio 3: Relógios Globais e Sincronização

Uma aplicação internacional precisa exibir horários em diferentes convenções culturais e manter instâncias sincronizadas.

### Contexto & Problema:
- Relógios possuem horas, minutos e segundos, e precisam sempre manter um estado válido (sem permitir minutos ou segundos negativos ou maiores que 59).
- O formato de exibição muda conforme o país:
  - No Brasil, o padrão segue o ciclo contínuo de 24 horas.
  - Nos Estados Unidos, o padrão não utiliza horas de 13 a 24, operando no formato de 12 horas.
- Qualquer relógio deve ser capaz de receber outro relógio (mesmo de tipo diferente) e clonar/sincronizar o horário dele para si próprio.

### Sua Missão:
- Modele essa hierarquia definindo o que deve ser obrigatório para todo relógio e o que deve ser responsabilidade de cada implementação local.
- Garanta encapsulamento estrito nas regras de transição de tempo e flexibilidade na sincronização entre tipos diferentes.
