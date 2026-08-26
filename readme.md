# **BANCO DE CRÉDITO DIGITAL**

#### **PAINEL ADMINISTRATIVO SUPREMO**

para o BANCO DE **CRÉDITO DIGITAL** fica com aparência de uma plataforma financeira de nível institucional — e não apenas “um sistema de empréstimos” — o **PAINEL ADMINISTRATIVO SUPREMO** deve funcionar como o **Centro de Comando Executivo de todo o ciclo de crédito** : <mark>cliente → análise → decisão → contrato → desembolso → pagamento → cobrança → recuperação → encerramento</mark> .

A ideia que usamos aqui é que, quando um investidor entrar no painel, ele perceba imediatamente:

**“Aqui existe controlo do dinheiro, controlo do risco, inteligência de crédito, segurança, rastreabilidade e capacidade de escala.”**



#### **Missão do painel**

Centralizar numa única plataforma:

- Gestão de clientes

- Solicitações de crédito

- Pontuação (Scoring)

- Análise de risco

- Aprovação/rejeição

- Contratos

- Desembolsos

- Carteira de crédito

- Pagamentos, todos os serviços, seja estado, telecomunicações, propinas, etc:

- • Cobranças

- Inadimplência (descumprimento de uma obrigação financeira no prazo combinado)

- Fraude, (aqui o sistema mostra o que é, e como esta blindado para que não haja invasão)

- IA, (para analises geral do sistema)

- Financeiro

- Parceiros

- Relatórios executivos

- Auditoria

- Segurança

- APIs e integrações, para a comunicação geral do sistema entre bancos e clientes

## **1. DASHBOARD EXECUTIVO SUPREMO**

Este é o primeiro ecrã do sistema.

Não se deve abrir uma página cheia de tabelas. Deve abrir um **centro executivo visual** , mostrando a saúde completa do negócio, porque é aqui a onde tudo esta concentrado.

#### **Cards principais**

|`┌─────────────────────────────────────────────────────────────────────────────┐`<br>`│`**`CRÉDITO DIGITAL — VISÃO EXECUTIVA`** **`│`**<br>`├──────────────────────────────────────────────────────────────────────────┤`|
|---|
|`┬┬┬`<br>`│`**`Clientes     │ Créditos     │ Carteira     │ Em atraso                      │`**<br>**`│ 125.430      │ 48.291       │ XXX Kz       │ XXX Kz                         │`**<br>**`├──────────────┼──────────────┼──────────────┼────────────────────────────────┤`**<br>**`│ Aprovados    │ Rejeitados   │ Desembolsado │ Recuperado                     │`**<br>**`│ XX%          │ XX%          │ XXX Kz       │ XXX Kz`**`│`<br>`└──────────────┴──────────────┴──────────────┴────────────────────────────────┘`|





#### **Indicadores**

- Clientes ativos

- Novos clientes

- Pedidos recebidos

- Pedidos em análise

- Créditos aprovados

- Créditos rejeitados

- Créditos desembolsados

- Valor total da carteira

- Capital em risco

- Créditos vencidos

- Taxa de inadimplência

- Taxa de recuperação

- Receita financeira

- Margem

- Liquidez disponível

- Fraudes detetadas



#### **Gráficos**

- Crescimento da carteira

- Créditos por província

- Créditos por produto

- Aprovação vs rejeição

- Pagamentos

- Inadimplência

- Recuperação

- Evolução financeira

#### **Ao clicar num indicador**

**Exemplo: Carteira de Crédito**

Abre:

**Carteira → Visão detalhada**

Com:

- ID do crédito



- Cliente

- Produto

- Valor original

- Saldo

- Taxa

- Prazo

- Próxima prestação

- Estado

- Dias em atraso

- Risco

- Agente responsável

#### **O que NÃO deve acontecer**

Clicar num card **não deve aprovar, cancelar ou desembolsar dinheiro diretamente** . O card apenas abre a informação detalhada. Operações financeiras críticas exigem:

**Visualizar → Abrir detalhe → Autorizar → MFA → Auditoria.**

## **2. GESTÃO DE CLIENTES**

#### **Missão**

Controlar toda a base de clientes do CREDIT DIGITAL.

Ao clicar:

## **Clientes**

```
Pesquisar cliente
[Nome       NIF      ID     telefone]
Filtros:
[Ativo] [Bloqueado] [Em análise] [Alto risco]
```

#### **Tabela**

|**Cliente**|**NIF**|**Perfil**|**Score**|**Créditos**|**Risco**|**Estado**|
|---|---|---|---|---|---|---|
|Cliente X|XXX|Premium|820|3|Baixo|Ativo|



#### **Ao clicar no cliente**

Abre o:

### **PERFIL FINANCEIRO DO CLIENTE**

#### **Aba 1 — Identidade**

- Nome completo

- NIF

- Documento

- Data de nascimento

- Nacionalidade

- Telefone

- Email

- Morada

- Profissão

- Empresa

- Rendimento declarado

#### **Aba 2 — KYC**

- Documento validado

- Biometria

- Verificação de identidade

- Data da validação

- Estado KYC

- Consentimentos

#### **Aba 3 — Perfil de crédito**

- Pontuação (Score)

- Avaliação (Rating)

- Histórico

- Créditos ativos

- Créditos encerrados

- Créditos vencidos

- Histórico de pagamentos

- Limite aprovado

- Limite disponível

#### **Aba 4 — Risco**

• Nível de risco

- Indicadores de risco

- Alertas

- Fraudes associadas

- Alterações suspeitas

#### **Aba 5 — Auditoria**

Tudo que aconteceu com o cliente, será exibido aqui.

### **3. SOLICITAÇÕES DE CRÉDITO**

Este será um dos módulos mais importantes.

Ao clicar:

### **CENTRAL DE PEDIDOS DE CRÉDITO**

Cards:

- Novos pedidos

- Em análise

- Pendentes

- Aprovados

- Rejeitados

- Expirados

- Necessitam intervenção humana

#### **Filtros**

- Produto

- Valor

- Cliente

- Província

- Pontuação (Score)

- Risco

- Data

- Estado

#### **Ao clicar num pedido**

Abre:

### **DOSSIÊ DIGITAL DE CRÉDITO**

#### **01 — Dados do cliente**

#### **02 — Crédito solicitado**

- Produto

- Valor solicitado

- Prazo

- Finalidade

- Rendimento

- Prestação estimada

- Garantia, quando aplicável

#### **03 — Análise automática**

- Pontuação (Score)

- Avaliação (Rating)

- Capacidade de pagamento

- Relação dívida/rendimento

- Histórico

- Comportamento

- Alertas

#### **04 — Decisão**

```
Pontuação Score: 782
Risco:            BAIXO
Capacidade:       ADEQUADA
Recomendação      IA: APROVAR
```

#### **Botões**

- Aprovar

- Rejeitar

- Solicitar documentação

- Enviar para análise humana

- Suspender

- Reavaliar

### **4. MOTOR DE CRÉDITO / CREDIT SCORING**

Este é um dos módulos que mais deve impressionar qualquer um, e aos investidores.

O CRÉDITO DIGITAL deve possuir um motor de decisão de crédito ( **Credit Decision Engine)** .

#### **Ao clicar**

Abre:

#### **MECANISMO DE INTELIGÊNCIA DE CRÉDITO (** credit intelligence engine **)**

#### **Análise**

- Score interno

- Histórico de pagamentos

- • Capacidade financeira

- Rendimento

- Endividamento

- Perfil de risco

- Comportamento

- Histórico de crédito

- Dados autorizados de parceiros

- • Indicadores antifraude

#### **Resultado**

```
CREDIT SCORE (PONTUAÇÃO DE CRÉDITO)
██████████████████░░  842
RATING (AVALIAÇÃO)
A+
RISCO
BAIXO
CAPACIDADE DE PAGAMENTO
ALTA
DECISÃO RECOMENDADA
APROVAR
```

#### **Configuração de score**

O administrador autorizado pode configurar:

- Peso de rendimento

- Peso do histórico

- Peso de pagamentos

- Peso de endividamento

- Peso de comportamento

- Limites de score

- Classes de risco

#### **Importante**

O sistema deve guardar **a razão da decisão** .

Não basta:

“Rejeitado.”

Deve existir:

“Rejeitado porque o perfil excedeu o limite de exposição definido pela política da nossa instituição financeira.”

Isso aumenta muito a transparência e auditabilidade da empresa.

### **5. GESTÃO DE RISCO**

#### **Missão**

Controlar o risco de toda a carteira.

Ao clicar:

### **RISK COMMAND CENTER**

#### **Dashboard**

- Risco baixo

- Risco médio

- Risco elevado

- Risco crítico

- Capital exposto

- Créditos vencidos

- Probabilidade de incumprimento

- Perdas estimadas

#### **Matriz**

```
                IMPACTO
             baixo → alto
RISCO
Baixo cor
Média cor
alta cor
crítica cor
```

#### **Ao clicar num risco**

Abre:



- Cliente

- Crédito

- Exposição

- Motivo

- Histórico

- Indicadores

- Recomendação

- Ações possíveis

### **6. CENTRAL ANTIFRAUDE**

Outro módulo estratégico do sistema.

#### **FRAUD COMMAND CENTER**

#### **Indicadores**

- Fraudes detectadas

- Tentativas bloqueadas

- Contas suspeitas

- Documentos suspeitos

- Dispositivos suspeitos

- IPs suspeitos

- Comportamentos anormais



#### **Motor antifraude no caso o sistema esteja conectado com o Ecossistema CISCLIENTE sobre a segurança de fraudes em 7 chaves**

Pode analisar:

- Device fingerprint (impressão digital do dispositivo)

- IP

- localização aproximada

- velocidade de comportamento



- múltiplas contas

- padrões de solicitação

- alterações cadastrais

- comportamento transacional

#### **Ao clicar numa ocorrência**



Abre:

### **CASO DE FRAUDE**

```
ID: FRAUD-000983
Severidade: CRÍTICA
Cliente
Dispositivo
IP
Data/hora
Operação
Valor
Regra acionada
Evidências
```

#### **Ações**

- Bloquear operação

- Bloquear conta

- Marcar para investigação

- • Liberar

- Escalar

- Criar incidente

#### **7. CARTEIRA DE CRÉDITO**

Aqui a empresa ou investidores consegue perceber onde está o dinheiro.

#### **Ao clicar:**

#### **PORTFÓLIO DE CRÉDITO**

Mostrar:

- Carteira total

- Capital desembolsado

- Capital recuperado

- Capital em risco

- Saldo devedor

- Juros previstos

- Juros recebidos

- Créditos ativos

- Créditos encerrados

#### **Segmentação**

- Produto

- Região

- Cliente

- Risco

- Prazo

- Estado

#### **Visualização**

```
CARTEIRA TOTAL
████████████████████
```

```
ATIVA
████████████████
```

```
VENCIDA
███
CRÍTICA
█
```

### **8. DESEMBOLSOS**

#### **Missão**

Controlar a saída de capital.

Ao clicar:

#### **CENTRAL DE DESEMBOLSOS**

Campos:

- ID

- Cliente

- Crédito

- Banco/conta destino

- Valor

- Data

- Estado

- Método

- Autorizadores

#### **Estados**

- Pendente

- Em validação

- Autorizado

- Processando

- Concluído

- Falhou

- Bloqueado

#### **Segurança**

Nenhum administrador deve conseguir simplesmente clicar:

“Desembolsar”

e o dinheiro sair.

Utilizar:

**Executor → Verificador → MFA → Execução → Auditoria**

### **9. PAGAMENTOS**

#### **Central de pagamentos**

Mostrar:

- Pagamentos de hoje

- Pagamentos previstos

- Pagamentos recebidos

- Pagamentos falhados

- Pagamentos atrasados

Ao abrir pagamento:

- Cliente

- Crédito

- Prestação

- Valor

- Juros

- Capital

- Multas aplicáveis

- Data

- Método

- Referência

- Estado

## **10. COBRANÇAS**

#### **CENTRAL DE COBRANÇA**

Segmentação:

- 1–7 dias

- 8–30 dias

- 31–60 dias

- 61–90 dias

- +90 dias

#### **Sistema pode executar**

- Notificação

- • SMS

- Email

- Push

- Contacto de atendimento

- Plano de regularização

- Escalonamento

#### **Ao clicar num cliente**

Abre:

##### **Dossiê de cobrança**

Com histórico completo.

### **11. RECUPERAÇÃO DE CRÉDITO**

#### **Missão**



Recuperar capital sem destruir o relacionamento com o cliente.

#### **Funcionalidades**

- Estratégia de recuperação

- Acordos

- Renegociação

- Planos de pagamento

- Histórico

- Promessas de pagamento



- Casos críticos

- Recuperação por agente

#### **Dashboard**

```
EM COBRANÇA
XXX Kz
RECUPERADO
XXX Kz
EM NEGOCIAÇÃO
XXX Kz
CRÍTICO
XXX Kz
```

## **12. PRODUTOS DE CRÉDITO**

Aqui o administrador cria os produtos.

Exemplos:

- Crédito pessoal

- Crédito salário

- Crédito empresarial

- Crédito emergência

- Crédito consumo

- Crédito para comerciantes

#### **Ao clicar em “Novo produto”**

##### Campos:

```
Nome do produto
Código
Descrição
Valor mínimo
Valor máximo
Prazo mínimo
Prazo máximo
Taxa
Periodicidade
Método de amortização
Critério mínimo de score
Perfil elegível
Garantias
Documentação necessária
Estado
```

#### **Configurações avançadas**

- Política de risco

- Limite de exposição

- Regras de aprovação

- Regras antifraude

- Elegibilidade

## **13. POLÍTICAS DE CRÉDITO**

Este módulo controla as regras do negócio.

#### **Exemplos**

```
Score mínimo
Rendimento mínimo
Endividamento máximo
Limite por cliente
Limite diário
Limite mensal
Exposição máxima
Prazo máximo
```

#### **Sistema de versões**



Cada alteração deve criar:

**Política v1.0 → v1.1 → v2.0**

Com:

- Quem alterou

- O que mudou

- Quando mudou

- Motivo

- Aprovação

Isso é extremamente importante para auditoria.

## **14. 🪪 KYC / IDENTIDADE**

#### **Central de identidade**

- Clientes verificados



- Pendentes

- Rejeitados

- Documentos expirados

- Alertas



#### **Processo**

```
Documento
↓
Validação
↓
Dados
↓
Biometria, quando aplicável
↓
Verificação
↓
KYC aprovado
```

#### **Campos**

- Documento

- NIF

- Nome

- Data nascimento

- Foto

- Estado de validação

- Data de validade

- Resultado

### **15. CREDIT AI**



Este deve ser o cérebro analítico.

#### **Menu:**

##### **CREDIT AI CENTER**

Submódulos:

- AI Scoring

- AI Risk

- AI Fraud

- AI Collections

- AI Forecast

- AI Customer Intelligence

- AI Executive Advisor

#### **AI Executive Advisor**

O CEO pode perguntar:

“Como está a carteira?”

E o sistema responder com dados do próprio sistema:

```
Carteira: XXX Kz
Principal risco:
aumento de atrasos no segmento X.
Recomendação:
reduzir exposição neste segmento e
reavaliar a política de concessão.
```

A IA deve **explicar a origem dos dados e não substituir controles de autorização** .

### **16. INSTITUIÇÕES E PARCEIROS**

#### **Gestão de parceiros**

- Bancos

- Instituições financeiras

- Empresas

- Operadores de pagamento

- Provedores de identidade

- APIs externas

#### **Ao clicar num parceiro**

Abrir:

- Dados institucionais

- Contrato

- API

- Estado da integração

- SLA

- Volume

- Transações

- Erros

- Credenciais

- Logs

### **17. APIs & INTEGRAÇÕES**

Este será o centro técnico.

#### **Dashboard**

```
APIs ATIVAS        28
ONLINE             26
DEGRADADAS          1
OFFLINE             1
```



#### **Serviços**

- Identity API

- KYC API

- Banking API

- Payment API

- Notification API

- Credit Bureau API

- Fraud API

- AI API

#### **Para cada API**

- Endpoint

- Método

- Estado

- Latência

- Requests

- Erros

- SLA

- Logs

- Rate limit

#### **Segurança**

- OAuth 2.0

- API Keys quando apropriado

- mTLS

- Rotação de credenciais

- Rate limiting

- IP allowlist

- Logs

- Monitoramento

### **18. FINANCEIRO**



O CFO deve e pode conseguir abrir o painel e compreender o negócio.

#### **Indicadores**

- Capital disponível

- Capital investido

- Capital desembolsado



- Receita

- Juros recebidos

- Custos

- Recuperações

- Perdas

- Margem

- Fluxo de caixa

#### **Relatórios**

- Diário

- Semanal

- Mensal

- Trimestral

- Anual

### **19. RELATÓRIOS EXECUTIVOS**

#### **Central de relatórios**

Categorias:

**Crédito**

**Financeiro**

**Risco**

**Fraude**

**Clientes**

**Cobrança**

**Operações**

**Auditoria**

#### **Exportação**

- PDF

- Excel

- CSV

#### **Relatório Executivo**

Deve gerar uma visão como:

##### **CRÉDITO DIGITAL — EXECUTIVE PERFORMANCE REPORT**

Com:

- Crescimento

- Carteira

- Risco

- Receita

- Inadimplência

- Recuperação

- Eficiência operacional

- Alertas

- Recomendações

### **20. CENTRAL DE ALERTAS**

#### **Prioridades**

Crítico . Alto . Médio Informação

#### **Exemplos**

- Tentativa de fraude

- API indisponível

- Aumento anormal de inadimplência

- Desembolso bloqueado

- Falha de pagamento

- Documento inválido

- Exposição de risco elevada

- Falha de integração

Ao clicar:

##### **Detalhes de Alertas**

com causa, evidências e ações.



### **21. GESTÃO DE ADMINISTRADORES**



#### **RBAC**

Perfis: cada um com os seus limites, e que pode e o que deve fazer (restrições Hierárquicos)

- Super Admin



- Diretor Executivo

- Diretor Financeiro

- Diretor de Crédito

- Gestor de Risco

- Gestor Antifraude

- Operador

- Analista

- Auditor

- Read Only

#### **Permissões**

```
Visualizar
Criar
Editar
Aprovar
Rejeitar
Executar
Exportar
Administrar
```

### **22. SEGURANÇA & ACESSOS**

Este módulo deve ter aparência de **Centro de Operações de Segurança financeiro** .

#### **Monitoramento**

- Sessões ativas

- Dispositivos

- IPs

- Localizações aproximadas

- Tentativas falhadas

- MFA

- Acessos privilegiados

- Alterações críticas

#### **Segurança**

- MFA

- RBAC

- Zero Trust

- Criptografia

- Gestão de sessões

- Device management

- Logs imutáveis

- Alertas

- Aprovação de operações críticas



### **23. AUDITORIA GLOBAL**

Tudo deve ser rastreável.

#### **Exemplo**

```
14:32:09
ADMIN: USER-0021
AÇÃO:
Alteração de limite de crédito
ANTES:
500.000 Kz
DEPOIS:
750.000 Kz
MOTIVO:
Revisão de política
APROVAÇÃO:
USER-0001
MFA:
VALIDADO
```

#### **Filtros**

- Utilizador

- Cliente

- Crédito

- IP

- Ação

- Data

- Módulo

- Severidade

### **24. MAPA EXECUTIVO**

Mapa nacional com:

- Clientes

- Créditos

- Carteira

- Risco

- Inadimplência

- Fraude

- Operações

Ao clicar numa região apresenta:

```
PROVÍNCIA
Clientes:      XXXX
Carteira:      XXX Kz
Créditos:      XXXX
Risco médio:   XX
Inadimplência: XX%
```

### **25. COMUNICAÇÃO**

#### **Central de comunicação**

Permite enviar:

- SMS

- Email

- Push

- Avisos internos

#### **Campanhas**

```
Nova campanha
```

```
Nome
Público
Mensagem
Canal
Data
Horário
```

```
Estado
```

Com aprovação antes do envio em massa.

#### **26. CONFIGURAÇÕES GLOBAIS**

Aqui fica a configuração estrutural.

#### **Submenus**

- Dados da plataforma

- Moeda

- Taxas

- Produtos

- Políticas

- Notificações

- APIs

- Segurança

- MFA

- Auditoria

- Integrações

- Templates

- Idiomas

- Parâmetros do sistema

#### **O GRANDE FLUXO DO CREDIT DIGITAL**

O sistema deve funcionar assim:

```
CLIENTE
   ↓
CADASTRO
   ↓
KYC
   ↓
SOLICITAÇÃO
   ↓
VALIDAÇÃO
   ↓
CREDIT SCORING
   ↓
ANÁLISE DE RISCO
   ↓
ANTIFRAUDE
   ↓
DECISÃO
   ↓
```

```
CONTRATO DIGITAL
   ↓
AUTORIZAÇÃO
   ↓
DESEMBOLSO
   ↓
PAGAMENTO
   ↓
MONITORAMENTO
```

```
   ↓
COBRANÇA
   ↓
RECUPERAÇÃO
```

```
   ↓
ENCERRAMENTO
```

#### **O QUE TORNA O SISTEMA DIFERENTE**

Estrutura do CRÉDITO DIGITAL em **6 grandes motores** :

**01 — CREDIT ENGINE**

Motor de concessão.

**02 — RISK ENGINE** Motor de risco.

**03 — FRAUD ENGINE** Motor antifraude.

**04 — AI ENGINE** Inteligência e previsão.

**05 — COLLECTION ENGINE** Cobrança e recuperação.

**06 — SECURITY ENGINE** Proteção, identidade e auditoria.

Assim, o produto deixa de parecer simplesmente: “uma aplicação para pedir empréstimos” e passa a ser:

**uma infraestrutura digital de gestão inteligente de crédito.**



#### **VISÃO DO INVESTIDOR**

No modo **Visualizador Executivo** , vai colocar-se uma tela especialmente preparada para investidores e conselho:

#### **CREDIT DIGITAL — BUSINESS INTELLIGENCE**

```
┌─────────────────────────────────────────────┐
│             PORTFÓLIO                       │
│              XXX Kz                         │
├─────────────────────────────────────────────┤
```

|`│ CLIENTES       CRÉDITOS       RECUPERAÇÃO   │`<br>|
|---|
|`│ XXXX           XXXX           XX%           │`<br>`├┤`|
|`─────────────────────────────────────────────`<br>`│ RISCO          INADIMPLÊNCIA  RECEITA       │`<br>|
|`│ BAIXO          X.X%           XXX Kz        │`<br>`└─────────────────────────────────────────────┘`|



E abaixo:

#### **Performance**

- Crescimento da carteira

- Crescimento de clientes

- Receita

- Recuperação

- Risco

#### **Inteligência**

**“Principais oportunidades”**

**“Principais riscos”**

**“Tendências detetadas”**

**“Recomendações executivas”**



#### **BENEFÍCIOS DO CRÉDITO DIGITAL**

### **Para a instituição**



- Redução do trabalho manual

- Decisões mais rápidas

- Controlo centralizado

- Melhor gestão do risco

- Redução de fraude

- Maior rastreabilidade

- Melhor cobrança

- Escalabilidade

- Integração via APIs

- Dados em tempo real

### **Para o cliente**

- Solicitação digital

- Menos burocracia

- Resposta mais rápida

- Acompanhamento do crédito

- • Transparência

- Notificações

- Histórico financeiro

### **Para investidores**

O painel permite demonstrar:

- Onde está o capital

- Quanto foi desembolsado

- Quanto foi recuperado

- Quanto está em risco

- Qual é o comportamento da carteira

- Como a empresa controla fraude

- Como o sistema escala

- Como as decisões são auditadas

- Como a tecnologia reduz custos operacionais

#### **REGRA DE OURO DO PAINEL SUPREMO**

**Nenhum clique deve executar uma operação financeira crítica imediatamente.**

Exemplo:

❌ Clicar em **“Aprovar”** → dinheiro liberado.

O correto para este sistema será:

##### **Aprovar**

→ abre resumo da operação

→ mostra risco → mostra impacto financeiro

→ solicita confirmação

→ verifica permissão → MFA → segundo autorizador quando exigido → executa → grava auditoria → envia notificação.

Para o que se pretende-se o BANCO DIGITAL tem uma arquitetura muito mais institucional.

### **ARQUITETURA FINAL DO PAINEL**

O menu principal:

```
 Dashboard Supremo
```

```
 Clientes
```

```
 Solicitações de Crédito
```

```
 Pontuação de Crédito
```

```
 Carteira de Crédito
```

```
 Desembolsos
```

```
 Pagamentos
```

```
 Cobranças
```

```
 Recuperação
```

```
 Produtos de Crédito
```

```
 Políticas de Crédito
```

```
 Gestão de Risco
```

```
 Antifraude
```

```
🪪 KYC & Identidade
```

```
 CREDIT AI
```

```
 Instituições & Parceiros
```

```
 APIs & Integrações
```

```
 Financeiro
```

```
 Relatórios Executivos
```

```
 Central de Alertas
```

```
 Mapa Nacional
```

```
 Comunicação
```

```
. Utilizadores & RBAC
```

```
 Segurança
```

```
 Auditoria & Logs
```

```
 Configurações Globais
```

#### **Resultado**

O **CREDIT DIGITAL** passa a ter três níveis de operação:

##### **Nível 1 — EXECUTIVO**

CEO, investidores e conselho acompanham o negócio.

##### **Nível 2 — OPERACIONAL**

Crédito, risco, financeiro, cobrança e antifraude trabalham diariamente.

##### **Nível 3 — TÉCNICO/SEGURANÇA**

APIs, infraestrutura, IAM, logs, monitoramento e integrações.

Essa separação é importante porque mantém o painel **poderoso sem ficar desorganizado** . O Admin Supremo tem visão global, mas cada área recebe apenas as ferramentas necessárias para executar sua função.

# **BANCO DE CRÉDITO DIGITAL**

#### **PAINEL OPERACIONAL NIVEL 2**

O Nível 2 não deve ter a mesma liberdade do Admin Supremo. O operador recebe **somente os módulos necessários à sua função** . Cada operação crítica deve respeitar:

**Permissão → Validação → Aprovação → MFA → Execução → Auditoria.**



### **01. PAINEL OPERACIONAL DE CRÉDITO**



#### **MISSÃO**

O painel do N2 representa o centro diário de análise, processamento e acompanhamento das solicitações de crédito.

O analista de crédito entra aqui para trabalhar, não para administrar toda a plataforma.



### **DASHBOARD**

Ao entrar:

|`CREDIT OPERATIONS`|
|---|
|`Pedidos novos                 1.248`|
|`Em análise                      382`|
|`Pendentes                        97`|
|`Aguardando documentos            61`|
|`Recomendados para aprovação     214`|
|`Recomendados para rejeição       42`|
|`Análise manual                   18`|



#### **Indicadores**

- Solicitações recebidas

- Solicitações analisadas

- Tempo médio de análise

- • Taxa de aprovação

- Taxa de rejeição

- Créditos pendentes

- Créditos escalados

- SLA de análise

## **MENU**

Dashboard Caixa de Solicitações Análise de Crédito Scoring Documentação Aprovações Contratos Desembolsos Carteira Alertas Relatórios



### **AO CLICAR EM "CAIXA DE SOLICITAÇÕES"**

Abre:

#### **Filtros**

- ID

- Cliente

- NIF

- Produto

- Valor



- Score

- Risco

- Data

- Estado

#### **Tabela**

**ID Cliente Produto Valor Score Risco Estado**

### **AO CLICAR EM UMA SOLICITAÇÃO**

Abre o:

#### **DOSSIÊ OPERACIONAL**

#### **01 — Cliente**

- Nome

- NIF

- Contacto

- KYC

- • Perfil

#### **02 — Crédito**

- Valor

- Prazo

- Taxa

- Finalidade

- Prestação

- Produto

#### **03 — Capacidade financeira**

- Rendimento

- Despesas

- Dívidas

- Capacidade de pagamento

- Exposição atual

#### **04 — Scoring**

- Score

- Rating

- Fatores positivos

- Fatores negativos

#### **05 — Risco**

- Nível

- Alertas

- Indicadores

#### **06 — Antifraude**

- Resultado da análise

- Dispositivo

- IP

- Sinais de risco

#### **07 — Decisão**

RECOMENDAÇÃO DO SISTEMA

Score: 784

Risco: BAIXO Capacidade: ADEQUADA RECOMENDAÇÃO: APROVAR

#### **BOTÕES**

#### **Aprovar**

Não desembolsa automaticamente.

Abre:



**Resumo → Confirmação → MFA → Aprovação → Auditoria.**



#### **Rejeitar**

Obrigatoriamente:

##### **Motivo da rejeição**

#### **Solicitar documentação**

Selecionar documento necessário.

#### **Escalar**

Enviar para:

- Supervisor

- Risco

- Antifraude

#### **O QUE NÃO DEVE ABRIR**

O operador de crédito **não deve conseguir** :

- Alterar políticas globais

- Alterar algoritmo de scoring

- • Criar administradores

- Alterar taxas globais

- Alterar limites sistémicos

- Apagar logs

- Alterar configurações de segurança



### **02. PAINEL OPERACIONAL DE RISCO**

#### **MISSÃO**

Controlar diariamente a exposição da carteira e identificar clientes/créditos que podem gerar perdas.

## **DASHBOARD**

RISK OPERATIONS Carteira monitorizada     XXX Kz Exposição de risco          XXX Kz Baixo                        XX% Médio                       XX% Alto                          XX% Crítico                      XX%

#### **Indicadores**

- Créditos de alto risco

- Exposição por cliente

- Exposição por produto

- Exposição geográfica

- Inadimplência

- Probabilidade de incumprimento

- Perda estimada

- Alertas ativos

### **MENU**

Dashboard Alertas de Risco Clientes em Risco Créditos em Risco

Carteira Modelos de Risco Análises Tendências Relatórios

### **AO CLICAR EM "CLIENTES EM RISCO"**

Abre:

#### **Cliente**

- Identificação

- • Score • Rating • Créditos • Saldo • Pagamentos • Histórico

#### **Análise**

RISCO ATUAL ALTO Motivos:

- aumento de exposição

- atraso de pagamento

- alteração de comportamento

Exposição: XXX Kz



#### **AO CLICAR EM "ALERTA DE RISCO"**

Abre:

##### **Risk Case**

- ID

- Cliente

- Crédito

- Regra acionada

- Severidade

- Data

- Evidências

- Exposição

- • Recomendação

#### **Ações**

- Monitorar

- Escalar

- Solicitar revisão

- Suspender nova concessão

- Encaminhar ao supervisor



### **03. PAINEL OPERACIONAL FINANCEIRO**

#### **MISSÃO**

Controlar diariamente o dinheiro que entra, sai e circula no CRÉDITO DIGITAL.

### **DASHBOARD**

FINANCE OPERATIONS

Disponibilidade                 XXX Kz Desembolsado hoje           XXX Kz Recebido hoje                   XXX Kz A receber                          XXX Kz Em atraso                         XXX Kz Recuperado                      XXX Kz

#### **Indicadores**

- Fluxo de caixa

- Recebimentos

- Desembolsos

- Pagamentos

- Comissões

- Juros

- Taxas

- Reembolsos

- Conciliação

### **MENU**

Dashboard Caixa Desembolsos

Recebimentos Conciliação Transações Comissões Carteira Financeira Fluxo de Caixa Relatórios

### **AO CLICAR EM "DESEMBOLSOS"**

Abre:

#### **Filtros**

- Data

- • Crédito

- Cliente

- Valor

- • Estado

- Banco/canal

#### **Estados**

PENDENTE VALIDAÇÃO APROVADO PROCESSANDO CONCLUÍDO FALHOU BLOQUEADO

### **AO CLICAR NUM DESEMBOLSO**

Abre:

#### **Detalhes**

- ID

- Crédito

- Cliente

- Valor

- Conta destino

- Instituição

- Data

- Referência

- Estado

#### **Segurança**

- Quem iniciou

- Quem aprovou

- • MFA

- Data/hora

- IP

- Device

- • Log

### **CONCILIAÇÃO**

O financeiro compara:

##### **CRÉDITO DIGITAL**

vs.

##### **Instituição financeira / gateway**

##### e identifica:

- Transações conciliadas

- Diferenças

- Duplicidades

- Transações pendentes

- Falhas

### **04. PAINEL DE COBRANÇA**

#### **MISSÃO**

Controlar clientes com pagamentos próximos, atrasados ou em incumprimento.



## **DASHBOARD**

###### COLLECTION OPERATIONS

|A vencer hoje             XXX Kz|
|---|
|1–7 dias                      XXX Kz|
|8–30 dias                    XXX Kz|
|31–60 dias                  XXX Kz|
|61–90 dias                  XXX Kz|
|+90 dias                     XXX Kz|



### **MENU**

Dashboard Próximos Pagamentos Em Atraso Contactos Negociações Acordos Recuperação Agentes Performance Relatórios

### **AO CLICAR EM UM CLIENTE**

Abre:

#### **DOSSIÊ DE COBRANÇA**

- Cliente

- Crédito

- Valor original

- Saldo

- Prestação

- Dias em atraso

- Histórico de pagamentos

- Histórico de contactos

- Promessas de pagamento

- Acordos

### **AÇÕES**

**Notificar**

SMS / Email / Push.

**Contactar**

Registar contacto.

#### **Negociar**

Criar proposta de regularização.

**Criar acordo**

Gerar plano aprovado.

#### **. Escalar**

Enviar para recuperação especializada.

### **05. PAINEL OPERACIONAL ANTIFRAUDE**

Este deve parecer um **Fraud Operations Center** .

#### **MISSÃO**

Detectar, investigar e bloquear comportamentos potencialmente fraudulentos.

### **DASHBOARD**

FRAUD OPERATIONS Alertas novos                    42 Em investigação               17 Bloqueados                        8 Confirmados                      5 Falsos positivos                12



#### **Indicadores**

- Fraudes detectadas

- Tentativas bloqueadas

- Contas suspeitas

- Documentos suspeitos

- Dispositivos suspeitos

- IPs suspeitos

- Transações anormais

### **MENU**

Dashboard Alertas Investigações

Contas Suspeitas Dispositivos IP / Rede Documentos Regras Antifraude Intelligence Casos

### **AO CLICAR NUM ALERTA**

Abre:

#### **FRAUD CASE**

CASE ID FRD-2026-000921 Severidade CRÍTICA Tipo Comportamento anómalo Valor XXX Kz

#### **Evidências**

- Cliente

- Dispositivo

- IP

- Timestamp

- Operação

- Histórico

- Regras acionadas

#### **Ações**

- Bloquear

- Liberar

- Monitorar

- Escalar

- Criar investigação



# **BANCO DE CRÉDITO DIGITAL**

#### **PAINEL TÉCNICO DE SEGURANÇA N3**

Agora entramos no nível que mantém todo o sistema de CRÉDITO DIGITAL vivo. Aqui não se trabalha diretamente com concessão de crédito. Aqui controla-se:

**infraestrutura + APIs + identidades + segurança + observabilidade + auditoria + integrações.**

### **06. PAINEL API & INTEGRAÇÕES**



#### **MISSÃO**

Controlar todas as APIs internas e externas para que não vaze qualquer informação fora do sistema, e manter o controlo com maior segurança.



### **DASHBOARD**

API CONTROL CENTER

APIs                                   47 ONLINE                            44 DEGRADADAS                 2 OFFLINE                            1 Solicitações hoje            8.4M Erro                                0.3%

Latência média            142ms

### **MENU**

Dashboard APIs

Integrações

Credenciais

Webhooks Rate Limits

Performance Erros API Logs Configurações

### **AO CLICAR EM UMA API**

Abre:

#### **API Overview**

- Nome

- Versão

- Endpoint

- Estado

- SLA

- Latência

- Solicitações

- Erros

#### **Segurança**

- OAuth

- mTLS

- API Key

- Certificado

- IP allowlist

- Rate limit

#### **Monitoramento**

- Uptime

- Latência

- Erros

- Tráfego

### **AO CLICAR EM "INTEGRAÇÕES"**

##### Exemplo:

Banco A ONLINE Banco B ONLINE

KYC Provider ONLINE

Payment Gateway DEGRADED

SMS Provider OFFLINE

Ao clicar:

##### **Integration Detail**

- Endpoint

- SLA

- • Último heartbeat • Último erro

- Requests

- Respostas

- Logs

- Credenciais

- Contacto técnico



### **07. PAINEL DE INFRAESTRUTURA**

#### **MISSÃO**

Monitorizar servidores, bases de dados, redes e serviços críticos.

#### **DASHBOARD**

INFRASTRUCTURE COMMAND CENTER

Servers                         24 Healthy                        22 Warning                         1 Critical                           1 CPU                          48% RAM                         61%

Storage                      57% Network                    32%

### **MENU**

Dashboard . Servidores Cloud Databases Network Storage Backups Services Incidents

### **AO CLICAR NUM SERVIDOR**

Abre:

- Hostname

- Ambiente

- CPU

- RAM

- Storage

- Network

- Uptime

- Serviços

- Alertas

- • Último backup

- Último incidente

### **DATABASE**

Mostrar:

- Estado

- Connections

- Queries

- Latência

- Storage

- Replicação

- Backup

- Erros

### **BACKUPS**

Último backup Hoje — 03:00

Estado SUCESSO

Integridade VALIDADA

Último teste de restauração 08/08/2026



### **08. PAINEL IAM — IDENTIDADE E ACESSOS**

## **MISSÃO**



Controlar **quem pode entrar no CRÉDITO DIGITAL e o que cada pessoa pode fazer** .

### **DASHBOARD**

IAM SECURITY Utilizadores                    284 Admins                             31 Sessões ativas                   97 MFA ativo                   100% Acessos suspeitos              4 Contas bloqueadas             8



### **MENU**

Dashboard Utilizadores Grupos . Roles Permissões MFA Devices Sessões Acessos Suspeitos Access Logs

### **AO CLICAR NUM UTILIZADOR**

Abre:

#### **Identity**

- Nome

- ID

- Departamento

- Estado

- Role

#### **Access**

- Permissões

- Sistemas

- Módulos

- Último acesso

#### **Security**

- MFA

- Devices

- Sessões

- IPs

- Alertas

### **REGRA CRÍTICA**



Nenhum administrador deve conseguir: atribuir a si próprio privilégios superiores. Alterações privilegiadas exigem:

##### **PAM + MFA + aprovação + auditoria.**



### **09. PAINEL DE AUDITORIA & LOGS**

#### **MISSÃO**

Garantir que **tudo o que acontece no CRÉDITO DIGITAL possa ser reconstruído posteriormente** .

### **DASHBOARD**

CENTER DE AUDITORIA

Eventos hoje                  2.4M Eventos críticos                  31 Acessos negados              124 Alterações críticas             17 Alertas                                 8

### **MENU**

Dashboard Audit Logs Security Logs Credit Logs Financial Logs API Logs Access Logs Critical Events Investigação Exportação

### **AO CLICAR NUM LOG**

Abre:

EVENT ID EVT-XXXXXX

Data/hora 11/08/2026 13:42

Utilizador USR-0092

Ação ALTERAÇÃO DE LIMITE Objeto CLIENT-XXXXX Antes 500.000 Kz

Depois 750.000 Kz

IP xxxxx Device xxxxx

Resultado SUCESSO

**CARACTERÍSTICA IMPORTANTE**

Logs críticos devem ser:

- Imutáveis

- Protegidos contra exclusão pelo operador

- Indexados

- Monitorizados

- Retidos segundo política

- • Exportáveis para investigação

### **10. PAINEL DE MONITORAMENTO**

##### Este é o **NOC/SOC técnico** do CRÉDITO DIGITAL.

#### **MISSÃO**

Este serva para detectar problemas antes que o negócio seja afetado.

## **DASHBOARD**

SYSTEM MONITOR Availability               99.98% API Health                99.97% Database Payments KYC Credit Engine Fraud Engine Notifications

#### **MENU**

Overview Services Infrastructure APIs Databases Performance Alerts Incidents Metrics Dashboards

### **AO CLICAR NUM SERVIÇO**

Abre:

#### **Saúde do Serviço**

- Uptime

- Latência

- Error rate

- Requests

- CPU

- Memory

- Dependencies

- • Incidentes

#### **Exemplo:**

CRÉDITO ENGINE

Status: SAÚDE Requests: 1.2M Latency: 120ms Error Rate: 0.08% Dependencies: KYC Risk Database



### **INCIDENT MANAGEMENT**

Se algo falhar:

INCIDENT #INC-2026-0041

Serviço: Payment API Severidade: CRÍTICA Detectado: 13:41:22

Impacto: Desembolsos afetados

**Fluxo**

**Detectar** ↓ **Classificar** ↓ **Criar incidente** ↓ **Atribuir equipa**

↓ **Mitigar** ↓ **Resolver** ↓ **Post-Mortem** ↓ **Auditoria**

### **11. PAINEL DE INTEGRAÇÕES EMPRESARIAIS**

Embora exista o controle técnico das APIs, este painel deve tratar do **ecossistema de parceiros** .

#### **MISSÃO**

Gerir o relacionamento técnico entre CRÉDITO DIGITAL e entidades externas.

## **DASHBOARD**

PARTNER INTEGRATIONS Instituições                  18 Integrações ativas        34 Pendentes                      3 Incidentes                      2

### **MENU**

Dashboard Instituições Integrações Contratos Técnicos SLA Endpoints Certificados Consumo Incidentes

### **AO CLICAR NUMA INSTITUIÇÃO**

Abre:

#### **Perfil técnico**

- Nome

- • ID

- Estado

- Ambiente

- APIs

- • Endpoints

- SLA

#### **Segurança**

- Certificados

- mTLS

- IPs autorizados

- Credenciais

- Expiração

#### **Performance**

- Requests

- Latência

- Erros

- Disponibilidade

#### **Contrato técnico**

- SLA

- Responsabilidades

- Contactos

- Janela de manutenção



### **ESTRUTURA FINAL DOS PAINÉIS**

#### **NÍVEL 1 — SUPREMO**

CEO / ADMIN SUPREMO │ ▼ VISÃO GLOBAL │ ┌──────┼──────┐ ▼      ▼      ▼ Negócio Risco Segurança

#### **NÍVEL 2 — OPERACIONAL**

OPERACIONAL │ ┌─────────────┼─────────────┐ │             │             │ ▼             ▼             ▼ CRÉDITO         RISCO       FINANCEIRO │             │             │ └─────────────┼─────────────┘ │ ┌──────┴──────┐ ▼             ▼

COBRANÇA       ANTIFRAUDE

#### **Responsabilidade**

**Executar o negócio.**

#### **NÍVEL 3 — TÉCNICO / SEGURANÇA**

TECH & SECURITY │ ┌────────────────┼────────────────┐ ▼                ▼                ▼ APIs         INFRAESTRUTURA       IAM │                │                │ └────────────────┼────────────────┘ │ ┌─────────┴─────────┐ ▼                   ▼ MONITORAMENTO       AUDITORIA │ ▼ INTEGRAÇÕES



#### **Responsabilidade**

**Garantir disponibilidade, segurança, integridade e rastreabilidade.**



### **FLUXO COMPLETO ENTRE OS NÍVEIS**

Este ponto é fundamental para o projeto.

##### **Exemplo: cliente solicita 500.000 Kz.**

CLIENTE │ ▼ CRÉDITO DIGITAL │ ▼ NÍVEL 2 — CRÉDITO │ ├── KYC ├── SCORING ├── RISCO └── ANTIFRAUDE │ ▼ DECISÃO │ ▼ NÍVEL 1 — SUPREMO │ ▼ AUTORIZAÇÃO │

▼ NÍVEL 2 — FINANCEIRO │ ▼ DESEMBOLSO │ ▼ NÍVEL 3 — APIs │ ▼ BANCO / PAYMENT │ ▼ MONITORAMENTO │ ▼ AUDITORIA



## **MATRIZ DE PERMISSÕES**

|**MAT**<br>**Operação**|**IZ DE**<br>**Supremo**|**ERMISS**<br>**Crédito**|**ES**<br>**Risco**|**Financeiro**|**Antifraude**|**Técnico**|
|---|---|---|---|---|---|---|
|Ver cliente|✅|✅|✅|Limitado|✅|❌|
|Analisar crédito|✅|✅|Consulta|❌|Consulta|❌|
|Aprovar crédito|✅|Conforme alçada|Consulta|❌|❌|❌|
|Alterar política|✅|❌|Proposta|❌|Proposta|❌|
|Desembolso|✅|❌|❌|✅|Bloqueio|❌|
|Bloquear fraude|✅|❌|❌|❌|✅|❌|
|Alterar API|❌/Aprov.|❌|❌|❌|❌|✅|
|Criar utilizador|✅|❌|❌|❌|❌|IAM|
|Alterar permissões|✅|❌|❌|❌|❌|IAM|
|Apagar logs|❌|❌|❌|❌|❌|❌|
|Ver logs|✅|Limitado|Limitado|Limitado|✅|✅|



### **O DIFERENCIAL FOI COLOCARIA NO CRÉDITO DIGITAL**

Criamos esses painéis não como páginas isoladas.

Para Criar **CRÉDITO DIGITAL CONTROL FABRIC** , onde os três níveis conversam permanentemente:



<!-- Start of picture text -->
                 ┌───────────────────┐<br>                 │ ADMIN SUPREMO                   │<br>                 │ EXECUTIVE CONTROL          │<br>                 └─────────┬─────────┘<br>                           │<br>              ┌────────────┴────────────┐<br>              │                         │<br>              ▼                         ▼<br>       ┌──────────────┐          ┌──────────────┐<br>       │ OPERAÇÕES               │          │ TECH/SECURITY        │<br>       └──────┬───────┘          └──────┬───────┘<br>              │<br>              └──────────┬──────────────┘<br>                         ▼<br>                ┌────────────────┐<br>                │ CREDIT DIGITAL │<br>                │ CORE PLATFORM │<br>                └────────────────┘<br><!-- End of picture text -->

Assim, o investidor não vê apenas **um painel bonito** .



Ele vê uma arquitetura empresarial onde:

**o dinheiro é controlado → o crédito é analisado → o risco é monitorizado → a fraude é combatida → as operações são executadas → a infraestrutura é observada → os acessos são protegidos → cada ação deixa evidência.**

Isso é o que dá ao **CRÉDITO DIGITAL** uma imagem de **infraestrutura financeira escalável e institucional** , em vez de uma simples aplicação de crédito.





# **BANCO DE CRÉDITO DIGITAL**

#### **APP DO UTILIZADOR FINAL**

#### **MISSÃO DO APP**



Permitir que qualquer cliente possa:

- Criar e validar a sua conta

- Fazer KYC

- Consultar o seu perfil financeiro

- Simular crédito

- Solicitar crédito

- Acompanhar análise

- Assinar contrato

- Receber o crédito

- Acompanhar prestações

- Pagamentos geral

- Receber notificações

- Consultar histórico

- Gerir segurança

- Contactar suporte

- Acompanhar a evolução da sua saúde financeira

#### **01. ECRÃ PRINCIPAL — HOME**

Este é o coração do aplicativo.

Não deve parecer uma aplicação bancária complicada. Deve ser extremamente clara.

```
┌───────────────────────────────────┐
```

```
│ Olá, Samuel                     │
```

```
│ Seu perfil está protegido       │
│                                   │
│ CRÉDITO DISPONÍVEL                │
│ 750.000 Kz                        │
│                                   │
│ ┌─────────────┐ ┌──────────────┐  │
│ │ Simular     │ │ Solicitar    │  │
│ │ Crédito     │ │ Crédito      │  │
│ └─────────────┘ └──────────────┘  │
│                                   │
│ PRÓXIMA PRESTAÇÃO                 │
│ 85.000 Kz                         │
│ Vencimento: 25 Ago                │
│                                   │
│ [ PAGAR AGORA ]                   │
│                                   │
│ Atividade recente                │
│ • Crédito aprovado               │
│ • Pagamento recebido             │
└───────────────────────────────────┘
```

#### **Cards principais**

- Crédito disponível

- Crédito ativo

- Próxima prestação

- Data de vencimento

- Total em dívida

- Estado financeiro

### **MENU PRINCIPAL**

Recomenda-se uma navegação inferior com **5 áreas** :

```
 Início
 Crédito
 Pagamentos
 Finanças
 Perfil
```

E um botão de ação rápida:

```
＋
```

para:

- Simular crédito

- Solicitar crédito

- Pagar

- Consultar contrato

- Contactar suporte

### **02. CRÉDITO**

Ao clicar em **Crédito** , abre o centro financeiro do utilizador.

```
MEUS CRÉDITOS
Crédito ativo
250.000 Kz
Saldo devedor
168.500 Kz
Próxima prestação
25.000 Kz
Vencimento
25/08/2026
```

#### **Abas**

- Ativos

- Em análise

- Encerrados

- Solicitações

#### ➕ **03. SIMULAR CRÉDITO**

Este deve ser um dos recursos mais bonitos do aplicativo.

O cliente informa:

#### **Quanto precisa?**

```
[500.000 Kz]
```

#### **Prazo**

```
6 meses
12 meses
18 meses
24 meses
```

#### **Resultado**

```
CRÉDITO SIMULADO
Valor:              500.000 Kz
Prazo:              12 meses
Prestação estimada:
████████████
XX.XXX Kz
Custo total:
XXX.XXX Kz
Taxas aplicáveis:
XXX Kz
```

#### **Botão**

**CONTINUAR SOLICITAÇÃO**

#### **Importante**

A simulação deve deixar claro:



**“Esta é uma simulação. A aprovação está sujeita à análise de crédito.”**

#### **04. SOLICITAR CRÉDITO**

Fluxo profissional em etapas.

#### **ETAPA 1 — Valor**

Quanto deseja?

#### **ETAPA 2 — Prazo**

Escolher prazo disponível.

#### **ETAPA 3 — Finalidade**

Exemplo:

- Consumo

- Educação

- Saúde

- Negócio

- Emergência

- Outro

#### **ETAPA 4 — Dados financeiros**

- Rendimento

- Fonte de rendimento

- Despesas

- Outros créditos

#### **ETAPA 5 — Documentos**

- Documento de identificação

- Comprovativo de rendimento

- Documentação adicional, quando exigida

#### **ETAPA 6 — Revisão**

Mostrar **tudo antes de enviar** .

#### **ETAPA 7 — Consentimento**

- Termos

- Política de privacidade

- Autorização para análise

#### **ETAPA 8 — Segurança**

**PIN/MFA/biometria** , conforme configuração.

#### **ETAPA 9**

#### **Pedido enviado.**

```
PEDIDO #CD-0002381
Estado:
 EM ANÁLISE
Valor:
500.000 Kz
Prazo:
12 meses
```

### **05. ACOMPANHAMENTO DA ANÁLISE**

O cliente não deve ficar sem saber o que aconteceu.

Criar uma timeline:

- ✓ `Solicitação recebida`

- `↓`

- ✓ `Identidade validada`

- `↓`

- ✓ `Documentos verificados`

- `↓`

✓ `Análise de crédito ↓ Decisão em processamento ↓ ○ Contrato ↓ ○ Desembolso`

Com isso reduz chamadas ao suporte e aumenta a confiança com os nossos clientes.

### **06. CRÉDITO APROVADO**

Quando aprovado:

```
 CRÉDITO APROVADO
Valor:
500.000 Kz
Prazo:
12 meses
Prestação:
XX.XXX Kz
Primeiro vencimento:
25/09/2026
```

#### **Botões**

**Ver contrato Continuar**

### **07. CONTRATO DIGITAL**

O utilizador deve conseguir consultar o contrato completo.

#### **Mostrar**

- Valor

- Prazo

- Taxas

- Prestação

- Datas

- Obrigações

- Condições

- Encargos aplicáveis

- Política de atraso

- Informações legais

#### **Ações**

- Visualizar

- Aceitar

- Assinar

- Guardar

- Partilhar

A assinatura deve gerar:

**data + hora + identificação + evidência de autenticação + versão do documento.**

### **08. DESEMBOLSO**

##### Depois da autorização:

```
DESEMBOLSO
Valor aprovado
500.000 Kz
Destino
Conta selecionada
Estado
 PROCESSADO
```

Ou: `EM PROCESSAMENTO` Ou:

```
 FALHOU
Motivo:
Não foi possível concluir a operação.
```

```
[Tentar novamente]
[Contactar suporte]
```



### **09. PRESTAÇÕES**

##### Ao clicar em **Pagamentos** :

```
PRÓXIMA PRESTAÇÃO
25.000 Kz
Vencimento:
25 agosto
```

```
[PAGAR AGORA]
```

Depois:

#### **Plano completo**

|**Parcela**|**Vencimento**|**Valor**|**Estado**|
|---|---|---|---|
|01|25/08|25.000 Kz|Pendente|
|02|25/09|25.000 Kz|Pendente|



### **10. PAGAR PRESTAÇÃO**

Ao clicar:

#### **Escolher método**

- Método disponível no ecossistema

- Conta associada

- Referência de pagamento

- Outro canal suportado

#### **Confirmação**

```
Valor
25.000 Kz
Crédito
CD-0002381
[CONFIRMAR PAGAMENTO]
```

Depois:

**Autenticação → processamento → recibo.**



### **11. RECIBOS**

Após pagamento:

✓ `PAGAMENTO CONFIRMADO Valor 25.000 Kz Data 25/08/2026 Referência`

```
CDPAY-XXXX
Crédito
CD-0002381
```

#### **Botões**

**Ver recibo**

**Partilhar**

**Guardar**

### **12. MINHAS FINANÇAS**

Aqui começa o lado inteligente do aplicativo.

### **Dashboard**

```
MINHA SAÚDE FINANCEIRA
Rendimento
XXX Kz
Despesas
XXX Kz
Créditos
XXX Kz
Pagamentos
XXX Kz
```

#### **Gráficos**

- Rendimentos

- Despesas

- Dívidas

- Pagamentos

- Evolução mensal

### **13. CREDIT DIGITAL INTELLIGENCE**

Uma área de inteligência financeira para o utilizador.

#### **Pode apresentar:**

**Saúde financeira**

Boa

##### **Compromisso mensal**

XX%

##### **Histórico de pagamentos**

Excelente

##### **Recomendação**



“Manter pagamentos dentro do prazo pode ajudar a preservar um bom perfil financeiro.”

Importante: o aplicativo **não deve prometer aprovação futura** com base nessas recomendações.



### **14. MEU PERFIL DE CRÉDITO**

Mostrar ao utilizador informações que podem ser legitimamente disponibilizadas sobre seu perfil.

```
MEU PERFIL DE CRÉDITO
Classificação:
BOA
Pagamentos no prazo:
96%
Créditos encerrados:
3
Crédito ativo:
1
```



Se existir um score próprio do produto e for permitido disponibilizá-lo:

```
CREDIT SCORE
782
```

#### **Explicação**

O cliente pode clicar em:

##### **“Como melhorar?”**

E receber orientações educativas:

- Pagar dentro do prazo

- Evitar excesso de endividamento

- Manter dados atualizados

- Rever compromissos financeiros

### **15. NOTIFICAÇÕES**

Central de comunicação.

#### **Tipos**

Crédito

Pagamentos

Contratos

Segurança

Informações

#### **Exemplos**

“Seu pedido de crédito entrou em análise.”

“Sua prestação vence em 3 dias.”

“Seu pagamento foi confirmado.”



“Detectamos uma tentativa de acesso à sua conta.”



### **16. SEGURANÇA**

Este menu precisa ser muito profissional.

#### **SECURITY CENTER**



#### **Estado**

```
SEGURANÇA DA CONTA
```

```
 Proteção alta
```

`MFA` ✓ `Ativo`

`Biometria` ✓ `Ativa`

```
Dispositivos
2 autorizados
```

#### **Opções**

- PIN

- Biometria

- MFA

- Dispositivos autorizados

- Sessões ativas

- Histórico de acessos

- Alterar credenciais

- Bloquear conta

#### **17. DISPOSITIVOS**

Mostrar:

```
MEUS DISPOSITIVOS
 Android
Este dispositivo
 Ativo
 Windows
Último acesso:
Hoje 08:31
```

#### **Ao clicar**

- Nome

- Sistema



- Último acesso

- Localização aproximada, quando tecnicamente disponível e autorizada

- Estado



#### **Botão**

##### **Remover dispositivo**

Com confirmação forte.



### **18. CENTRAL DE SEGURANÇA**

Uma função muito importante.

#### **Botão:**

### **PROTEGER MINHA CONTA**

Ao ativar:

- Bloquear novas operações sensíveis

- Encerrar sessões

- Marcar conta como protegida

- Alertar segurança

- Orientar contacto com suporte

Dependendo da arquitetura, algumas ações podem exigir validação adicional para evitar abuso.

### **19. PERFIL**

#### **Dados pessoais**

- Nome

- NIF

- Documento

- Telefone

- Email

- Morada

- Dados profissionais

#### **Estado**

```
IDENTIDADE
KYC
 Verificado
Documento
 Válido
```

### **🪪 20. KYC DIGITAL**

##### Fluxo:

```
Dados pessoais
       ↓
Documento
       ↓
Captura/validação
       ↓
Verificação
       ↓
Resultado
```

#### **Estados**

Pendente . Verificado

. Necessita correção

Se precisar de correção:

“A imagem do documento não está suficientemente legível.”

Em vez de simplesmente:

“KYC rejeitado.”

### **21. SUPORTE**

Criaria um verdadeiro **CRÉDITO CARE CENTER** .

#### **Opções**

- Perguntas frequentes

- Chat

- Solicitar atendimento

- Reclamações

- Estado de solicitações

- Ajuda com pagamentos

- Ajuda com crédito

- Segurança da conta

### **22. MEUS PEDIDOS DE SUPORTE**

```
TICKETS
#SUP-00391
Pagamento
 Em análise
#SUP-00372
Crédito
 Resolvido
```



Ao abrir:

- Assunto

- Mensagens

- Documentos

- • Estado

- Responsável

- • Histórico

### **23. EDUCAÇÃO FINANCEIRA**

Uma área que pode diferenciar bastante o produto.

#### **Conteúdos**

- Como funciona um crédito

- Como calcular prestação

- Como evitar excesso de dívida

- Como organizar orçamento

- Como melhorar disciplina financeira

- Segurança contra fraude

- Segurança digital

### **24. BENEFÍCIOS / PROGRAMAS**

Opcionalmente:

- Benefícios para clientes com bom histórico

- Campanhas

- Redução de custos quando aplicável

- Produtos elegíveis

- Ofertas personalizadas

Mas **sem transformar o aplicativo em uma máquina de incentivar endividamento** .

### **25. CONFIGURAÇÕES**

#### **Conta**



- Dados pessoais

- Preferências

- Idioma

- Notificações

#### **Segurança**

- MFA

- Biometria

- PIN

- Dispositivos

- Sessões

#### **Privacidade**

- Consentimentos

- Dados partilhados

- Preferências de comunicação

- Solicitações relacionadas aos dados

### **26. DOCUMENTOS**

Uma espécie de **cofre digital do cliente** .

Guardar:



- Contratos

- Recibos

- Comprovativos

- Documentos submetidos

- Termos aceites

- Comunicações importantes

### **27. HISTÓRICO**

O cliente pode consultar tudo:

```
ATIVIDADE
13 Ago
Pagamento recebido
+25.000 Kz
12 Ago
Contrato consultado
10 Ago
Pedido de crédito enviado
09 Ago
KYC aprovado
```



### **28. ALERTAS DE PAGAMENTO**

O sistema pode trabalhar preventivamente.

#### **Exemplo**

##### **7 dias antes**

- “Sua prestação de 25.000 Kz vence em 7 dias.”

##### **3 dias antes**

“Lembrete: sua prestação vence em 3 dias.”

##### **No vencimento**

“Sua prestação vence hoje.”

##### **Após atraso**

“Identificamos uma prestação pendente. Consulte as opções disponíveis.”

Sempre de maneira transparente e respeitosa.

### **29. ASSISTENTE DIGITAL CREDIT AI**

Aqui podemos colocar um assistente inteligente dentro da app.

O cliente pode perguntar:

“Quanto ainda devo?”

“Quando vence minha próxima prestação?”

“Mostre meus pagamentos.”

“Quero simular 300.000 Kz.”

“Explique meu contrato.”

“Como posso organizar melhor minhas prestações?”

A IA deve consultar apenas dados aos quais aquele cliente tem autorização de acesso.

E, principalmente:



**A IA não deve inventar valores, taxas ou condições.**

### **FLUXO COMPLETO DO CLIENTE**

O aplicativo inteiro deve seguir:

```
DOWNLOAD
   ↓
REGISTRO
   ↓
VERIFICAÇÃO
   ↓
KYC
   ↓
CONTA ATIVADA
   ↓
HOME
```

```
   ↓
```

```
SIMULAÇÃO
   ↓
SOLICITAÇÃO
   ↓
ANÁLISE
   ↓
DECISÃO
   ↓
CONTRATO
   ↓
ASSINATURA
   ↓
DESEMBOLSO
   ↓
PAGAMENTOS
   ↓
ACOMPANHAMENTO
   ↓
ENCERRAMENTO
   ↓
HISTÓRICO
```

### **O QUE O CLIENTE NÃO DEVE VER**



Para proteger o negócio e evitar confusão, o APP não deve mostrar:

- ❌ Regras internas completas do scoring



- ❌ Thresholds antifraude

- ❌ IPs internos

- ❌ Logs técnicos

- ❌ Credenciais/API keys

- ❌ Dados de outros clientes

- ❌ Informações de outros utilizadores

- ❌ Regras internas de risco

- ❌ Ferramentas administrativas

- ❌ Dados confidenciais dos operadores

Mas deve mostrar **explicações claras e suficientes** quando uma decisão de crédito exigir transparência, respeitando as regras aplicáveis.



### **ARQUITETURA DE SEGURANÇA DO APP**

Eu estruturaria:

```
                    APP CLIENTE
                         │
                         ▼
                 API GATEWAY
                         │
            ┌────────────┼────────────┐
            ▼            ▼            ▼
          IAM          KYC        FRAUD
```



<!-- Start of picture text -->
            │            │            │<br>            └────────────┼────────────┘<br>                         ▼<br>                  CREDIT ENGINE<br>                         │<br>                  RISK ENGINE<br>                         │<br>                         ▼<br>                 DECISION ENGINE<br>                         │<br>              ┌──────────┴──────────┐<br>              ▼                     ▼<br>          PAYMENT                AUDIT<br><!-- End of picture text -->

#### **Proteções**

- TLS

- MFA

- Biometria

- Sessões seguras

- Device binding quando apropriado

- • Rate limiting

- Detecção antifraude

- Criptografia de dados sensíveis

- Tokenização quando aplicável

- Logs de segurança

- Gestão de consentimentos

- Proteção contra abuso de APIs

### **HOME FINAL DO CRÉDITO DIGITAL**

Eu faria o aplicativo com esta hierarquia:

```
┌────────────────────────────────────┐
│ CREDIT DIGITAL                     │
│                                    │
│ Olá, Samuel                      │
│                                    │
│ ┌────────────────────────────────┐ │
│ │ CRÉDITO DISPONÍVEL             │ │
│ │                                │ │
│ │ 750.000 Kz                     │ │
│ │                                │ │
│ │ [SIMULAR] [SOLICITAR]          │ │
│ └────────────────────────────────┘ │
│                                    │
│ PRÓXIMO PAGAMENTO                  │
│ 25.000 Kz                          │
│ 25 Ago                             │
│                                    │
│ [PAGAR AGORA ]                     │
│                                    │
│ ─────────────────────────────────  │
│                                    │
```

```
│ Minha saúde financeira             │
```

`│ Boa                             │ │                                    │ │ Atividade                          │ │` ✓ `Pagamento confirmado             │ │` ✓ `KYC aprovado                     │ │                                    │ │ │ └────────────────────────────────────┘`

### **O GRANDE ECOSSISTEMA**

No final, teríamos **4 camadas perfeitamente conectadas** :

```
                    CRÉDITO DIGITAL
                         │
        ┌────────────────┼────────────────┐
        │                │                │
        ▼                ▼                ▼
 CLIENTE        SUPREMO        TECH/SECURITY
        │                │                │
        │                ▼                ▼
        │           OPERAÇÕES        APIs
        │           RISCO            INFRA
        │           FINANCEIRO       IAM
        │           COBRANÇA         LOGS
        │           ANTIFRAUDE       MONITOR
        │
        ▼
   SOLICITAÇÃO
        ↓
      KYC
        ↓
    SCORING
        ↓
      RISCO
        ↓
    ANTIFRAUDE
        ↓
     DECISÃO
        ↓
     CONTRATO
        ↓
    DESEMBOLSO
        ↓
     PAGAMENTO
        ↓
    RECUPERAÇÃO
        ↓
    ENCERRAMENTO
```





# **HUB DE PAGAMENTOS**



O menu **Pagamentos** passa a ser um dos módulos principais da APP.

#### **Missão**



**Permitir ao utilizador pagar, transferir, receber e gerir operações financeiras através de diferentes métodos, com segurança, confirmação e rastreabilidade.**

### **01. ECRÃ PRINCIPAL — PAGAMENTOS**

Ao clicar em **Pagamentos** :

```
┌───────────────────────────────────┐
```

```
│             PAGAMENTOS            │
```

```
│                                   │
```

```
│ O que deseja fazer?               │
```

```
│                                   │
```

```
│ [ Pagar Serviço]                │
```

```
│ [ Pagar por Referência]         │
```

`│ [` ▣ `Pagar com QR]                  │`

```
│ [ Transferir]                   │
```

```
│ [ Enviar Dinheiro]              │
```

```
│ [ Receber Dinheiro]             │
```

```
│ [ Pagar Cartão]                 │
│ [ Pagar Fatura]                 │
│                                   │
```

```
│ ───────────────────────────────   │
│ Pagamentos recentes               │
│                                   │
```

`│` ✓ `Internet         25.000 Kz      │ │` ✓ `Energia          18.500 Kz      │ │` ✓ `Transferência    50.000 Kz      │ └───────────────────────────────────┘`

### **02. PAGAR SERVIÇOS**

Ao clicar:

#### **Categorias**

```
 Casa
 Energia
 Água
 Internet
 TV
 Telecomunicações
 Educação
 Saúde
 Serviços públicos
 Transportes
 Seguros
 Empresas
 Outros serviços
```

O sistema apresenta os prestadores disponíveis através das integrações autorizadas.



### **03. PAGAR ENERGIA**

Fluxo:

```
Energia
   ↓
Selecionar fornecedor
   ↓
Número de cliente / contrato
   ↓
Consultar dívida
```

```
   ↓
Valor
   ↓
Confirmar
   ↓
Autenticação
   ↓
Pagamento
   ↓
Recibo
```

#### **Tela:**

```
ENERGIA
Número do cliente
[________________]
[ CONSULTAR ]
```

```
Saldo encontrado:
18.500 Kz
Valor a pagar
[18.500 Kz]
[ CONTINUAR ]
```



### **04. INTERNET / TV / TELECOM**

Mesmo conceito:

#### **Campos**

- Operador



- Número de cliente

- Número de contrato

- Valor

- Período

- Referência

#### **Resultado**

```
CLIENTE:
XXXXXXXX
```

```
SERVIÇO:
Internet
```

```
VALOR:
25.000 Kz
```

```
[ PAGAR ]
```

### **05. PAGAMENTO POR REFERÊNCIA**

Este precisa ser um módulo próprio.

Ao clicar:

### **PAGAR POR REFERÊNCIA**



<!-- Start of picture text -->
Tipo de referência<br>[ Selecionar ]<br>Referência<br>[________________]<br>Valor<br>[________________]<br><!-- End of picture text -->



<!-- Start of picture text -->
Dependendo do serviço, o sistema pode consultar automaticamente:<br><!-- End of picture text -->

```
REFERÊNCIA ENCONTRADA
Entidade:
Empresa XYZ
Descrição:
Fatura Agosto
Valor:
35.000 Kz
Vencimento:
30/08/2026
```

#### **Botão**

##### **CONFIRMAR PAGAMENTO**

### **06. PAGAR POR QR CODE**

Ao clicar:

### **SCAN QR**

Abre a câmera:

```
┌─────────────────────────┐
│                         │
│      [ QR CODE ]        │
│                         │
│   Aponte para o código  │
│                         │
└─────────────────────────┘
```

Depois de ler:

```
PAGAMENTO QR
```

```
Comerciante:
Empresa ABC
```

```
Valor:
12.500 Kz
```

```
Referência:
QR-XXXXXXXX
```

```
[ CONFIRMAR ]
```

#### **Segurança**

Antes da execução:

**Valor + destinatário + método + autenticação.**

### **07. TRANSFERÊNCIA**

Ao clicar:

### **NOVA TRANSFERÊNCIA**

#### **Destinatário**

```
Tipo:
```

- `Conta bancária`

- `Beneficiário salvo`

- `Número de conta`

- `IBAN`

#### **Campos**

- Nome do beneficiário

- Banco/instituição

- Número da conta/IBAN

- Valor

- Descrição

- Referência

### **CONFIRMAÇÃO DA TRANSFERÊNCIA**

Nunca executar diretamente.

Mostrar:

```
CONFIRMAR TRANSFERÊNCIA
```

```
Para:
João António
```

```
Banco:
XXXX
```

```
Conta:
XXXXXXXX
```

```
Valor:
150.000 Kz
```

```
Taxa:
XXX Kz
```

```
Total:
XXX Kz
```

#### **Depois:**

**Biometria / PIN / MFA**

↓ Processamento ↓ Recibo.



### **08. ENVIAR DINHEIRO**

Para transferências entre utilizadores do ecossistema.

O utilizador pode selecionar:

- Contacto

- Número de telefone

- ID do utilizador

- Beneficiário salvo

#### **Exemplo**

```
ENVIAR DINHEIRO
```

```
Para:
```

```
[ Samuel António ]
```

```
Valor:
```

```
[ 50.000 Kz ]
```

```
Mensagem:
[________________]
[ CONTINUAR ]
```

### **09. RECEBER DINHEIRO**

Aqui podemos criar uma experiência muito interessante.

#### **Opções**





<!-- Start of picture text -->
Gerar QR<br>Gerar referência<br>Solicitar pagamento<br>Partilhar dados de recebimento<br>Exemplo:<br>RECEBER DINHEIRO<br>[ GERAR QR ]<br>[ GERAR REFERÊNCIA ]<br>[ SOLICITAR PAGAMENTO ]<br><!-- End of picture text -->

### **10. MEU QR DE PAGAMENTO**

O cliente pode gerar um QR associado à sua conta ou a uma solicitação específica.



<!-- Start of picture text -->
┌─────────────────────────┐<br>│                         │<br>│        ▣ ▣ ▣ ▣ ▣          │<br>│        ▣ ▣ ▣          │<br>│        ▣ ▣ ▣ ▣ ▣          │<br>│                         │<br>│ Samuel                  │<br>│ CREDIT DIGITAL          │<br>└─────────────────────────┘<br><!-- End of picture text -->

Pode ser:

- QR com valor definido

- QR sem valor

- QR para cobrança

- QR temporário

### **11. PAGAR FATURAS**

Criaria uma área:

### **MINHAS FATURAS**

```
Internet       25.000 Kz    Pendente
Energia        18.500 Kz    Pago
TV             12.000 Kz    Próximo
Educação       80.000 Kz    Pendente
```



Ao clicar numa fatura:

- Prestador

- Número de cliente

- Período

- Valor

- Vencimento

- Estado

- Histórico

### **12. SERVIÇOS PÚBLICOS**

Uma área específica para serviços públicos **quando houver integração oficial/autorizada** .

Categorias possíveis:

- Taxas



- Documentação

- Serviços administrativos

- Licenças

- Multas/obrigações, quando integradas

- Outros serviços públicos disponíveis

#### **Fluxo**

```
Serviço
 ↓
Identificação
 ↓
Consulta
 ↓
Valor
```

```
 ↓
Confirmação
 ↓
Pagamento
 ↓
Recibo
```

### **13. PAGAMENTO DE CARTÃO**

Se o ecossistema tiver cartões:

```
MEUS CARTÕES
```

```
Cartão •••• 4821
```

```
Fatura:
85.000 Kz
Vencimento:
30 Ago
[ PAGAR ]
```



Pode permitir:

- Pagar fatura

- Consultar movimentos

- Consultar limite

- Bloquear cartão

- Desbloquear

- Consultar cartão

### **14. PAGAMENTOS RECORRENTES**

Muito importante para o ecossistema.

O utilizador pode configurar:

```
PAGAMENTOS RECORRENTES
Internet
25.000 Kz
Mensal
 Ativo
TV
12.000 Kz
Mensal
 Ativo
```

#### **Configuração**

- Serviço

- Valor

- Periodicidade

- Data

- Conta de débito

- Limite máximo

- Notificação antes do pagamento

**Nunca deve haver débito automático sem consentimento explícito e controlável pelo utilizador.**

### ⭐ **15. BENEFICIÁRIOS**

Criar:

### **MEUS BENEFICIÁRIOS**

```
 João António
 Banco X
```

```
 Empresa ABC
 Referência XXXXX
```

```
 Maria
 +244 XXX XXX XXX
```

#### **Ao adicionar beneficiário**

Pode exigir:

- Nome

- Banco

- Conta

- IBAN

- Tipo

- Descrição

E, para operações sensíveis, aplicar confirmação adicional.



### **16. HISTÓRICO DE PAGAMENTOS**

Este deve ser muito completo.

`HISTÓRICO Hoje` ✓ `Transferência 50.000 Kz`

```
Hoje
```

✓ `Energia`

```
18.500 Kz
```

```
Ontem
```

✓ `QR Payment 12.000 Kz`

```
10 Ago
```

- ✓ `Internet`

```
25.000 Kz
```

#### **Filtros**

- Data

- Tipo

- Estado

- Valor

- Serviço

- Beneficiário

### **17. RECIBO DIGITAL**

##### Depois de qualquer pagamento:

✓ `PAGAMENTO CONCLUÍDO`

```
Valor:
50.000 Kz
```

```
Tipo:
Transferência
```

```
Destinatário:
João António
```

```
Data:
13/08/2026
```

```
Referência:
CDP-20260813-XXXX
```

```
Estado:
CONCLUÍDO
```

#### **Botões**

**Ver recibo**

**Guardar**

**Partilhar**

##### **Enviar por email**

### **18. PAGAMENTO FALHOU**

Não mostrar apenas:

“Erro.”

Mostrar:

```
PAGAMENTO NÃO CONCLUÍDO
Estado:
 FALHOU
Motivo:
O serviço externo não respondeu.
O seu saldo não foi debitado.
```

Se houver dúvida sobre débito:



**“Estamos a confirmar o estado da operação. Não tente pagar novamente até a confirmação.”**

Isso evita pagamentos duplicados.

### **19. SEGURANÇA DOS PAGAMENTOS**

Cada operação deve passar por um **Payment Security Engine** .

```
CLIENTE
 ↓
AUTENTICAÇÃO
 ↓
VALIDAÇÃO DA OPERAÇÃO
 ↓
ANTIFRAUDE
 ↓
LIMITES
 ↓
CONFIRMAÇÃO
 ↓
PROCESSAMENTO
 ↓
RECIBO
 ↓
AUDITORIA
```

#### **Proteções**

- PIN

- Biometria

- MFA

- Device binding quando aplicável

- Limites transacionais

- Antifraude

- Rate limiting

- Criptografia

- Monitoramento

- Idempotência para evitar duplicidade

- Auditoria completa

### **20. LIMITES DE PAGAMENTO**

O utilizador pode visualizar os limites aplicáveis:

```
LIMITES
Transferência diária
500.000 Kz
Pagamento QR
200.000 Kz
Pagamento por referência
300.000 Kz
Transferência individual
250.000 Kz
```

Os limites reais devem ser definidos pela política da instituição e pelas integrações disponíveis.

### **21. CENTRAL DE SEGURANÇA FINANCEIRA**

Dentro do Hub de Pagamentos:

#### **Botão:**

##### **PROTEGER PAGAMENTOS**

Pode permitir:

- Bloquear temporariamente pagamentos

- Bloquear transferências

- Encerrar sessões

- Remover dispositivo

- Contactar suporte

- Consultar atividade suspeita

### **22. CREDIT AI + PAGAMENTOS**

A IA pode ajudar o utilizador a compreender as operações.

Exemplo:

##### **“Quanto paguei este mês?”**

Resposta baseada nos dados disponíveis:



“Foram realizados 8 pagamentos, totalizando XXX Kz.”

Ou:

##### **“Quais são as minhas maiores despesas?”**

E mostrar:

`1. Educação       XXX Kz`

`2. Energia        XXX Kz 3. Internet       XXX Kz 4. Transferências XXX Kz`

A IA **não deve executar pagamentos apenas porque recebeu uma instrução textual** , sem passar pelas mesmas confirmações e autenticações exigidas pelo fluxo normal.



### **NOVA HOME DA APP**

Com este módulo, eu mudaria a Home para:



<!-- Start of picture text -->
┌─────────────────────────────────────┐<br>│ CREDIT DIGITAL                      │<br>│ Olá, Samuel                        │<br>│                                     │<br>│ Saldo disponível                    │<br>│ XXX.XXX Kz                          │<br>│                                     │<br>│ ┌────────┐ ┌────────┐ ┌──────────┐  │<br>│ │       │ │       │ │ ▣         │  │<br>│ │Crédito │ │Pagar   │ │QR        │  │<br>│ └────────┘ └────────┘ └──────────┘  │<br>│                                     │<br>│ ┌────────┐ ┌────────┐ ┌──────────┐  │<br>│ │       │ │       │ │        │  │<br>│ │Referên.│ │Enviar  │ │Receber   │  │<br>│ └────────┘ └────────┘ └──────────┘  │<br>│                                     │<br><!-- End of picture text -->

```
│ PRÓXIMA PRESTAÇÃO                   │
│ 25.000 Kz                           │
│ [ PAGAR AGORA ]                     │
│                                     │
│ ATIVIDADE RECENTE                   │
```

`│` ✓ `Energia             18.500 Kz     │ │` ✓ `Transferência       50.000 Kz     │ │` ✓ `QR Payment          12.000 Kz     │ │                                     │ │ │ └─────────────────────────────────────┘`



<!-- Start of picture text -->
HUB FINANCEIRO COMPLETO<br>E a arquitetura final da APP ficaria:<br>                         CREDIT DIGITAL APP<br>                                │<br>          ┌─────────────────────┼─────────────────────┐<br>          │                     │                     │<br>          ▼                     ▼                     ▼<br> CRÉDITO              PAGAMENTOS          FINANÇAS<br>          │                     │                     │<br>          │             ┌───────┼────────┐            │<br>          │             │       │        │            │<br>          │             ▼       ▼        ▼            │<br>          │          Refer.     QR    Transfer.       │<br>          │             │       │        │            │<br>          │             ├───────┼────────┤            │<br>          │             │       │        │            │<br>          │             ▼       ▼        ▼            │<br>          │          Serviços  Faturas  Pessoas       │<br>          │                                            │<br>          └────────────────────────────────────────────┘<br>                                │<br>                                ▼<br> PAYMENT SECURITY<br>                                │<br>                  ┌─────────────┼─────────────┐<br>                  ▼             ▼             ▼<br>                MFA         ANTIFRAUDE     LIMITES<br>                  │             │             │<br>                  └─────────────┼─────────────┘<br>                                ▼<br>                         PAYMENT ENGINE<br>                                │<br>                                ▼<br>                         PROCESSAMENTO<br>                                │<br>                                ▼<br>                           RECIBO + LOG<br><!-- End of picture text -->