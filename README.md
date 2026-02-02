
# restaurante_

#  Sistema de Gerenciamento de Restaurante

##  Status do Projeto
 **Em Desenvolvimento** 

🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 8+
- **Banco de Dados:** MySQL 8.0
- **IDE:** Apache NetBeans
- **Build Tool:** Maven
- **Interface Gráfica:** Java Swing
- **Controle de Versão:** Git/GitHub

## Time de Desenvolvedores

- **Desenvolvedor Principal:** Matheus Araujo Santos

## Objetivo do Software

O Sistema de Gerenciamento de Restaurante foi desenvolvido para facilitar o controle de pedidos, cadastro de clientes e produtos em estabelecimentos do ramo alimentício. O sistema visa automatizar processos manuais, reduzir erros operacionais e melhorar a experiência tanto dos funcionários quanto dos clientes.

## ⚙️ Funcionalidades do Sistema

###Requisitos Funcionais

1. **Gestão de Clientes**
   - Cadastro de novos clientes
   - Armazenamento de nome e telefone
   - Validação de dados obrigatórios

2. **Gestão de Produtos**
   - Cadastro de produtos do cardápio
   - Registro de nome e preço
   - Validação de valores numéricos
   - Aceitação de preços com vírgula ou ponto

3. **Gestão de Pedidos**
   - Registro de pedidos vinculados a clientes
   - Seleção de produtos do cardápio
   - Definição de quantidade
   - Cálculo automático do valor total
   - Validação de cliente existente

4. **Interface Gráfica**
   - Tela de login
   - Menu principal de navegação
   - Telas específicas para cada funcionalidade
   - Mensagens de confirmação e erro
   - Limpeza automática de formulários após cadastro

5. **Persistência de Dados**
   - Conexão com banco de dados MySQL
   - Operações CRUD (Create, Read) implementadas
   - Transações seguras com tratamento de exceções

## 🗄️ Estrutura do Banco de Dados

### Tabela: `cliente`
- `id` (INT, PRIMARY KEY, AUTO_INCREMENT)
- `nome` (VARCHAR)
- `telefone` (VARCHAR)

### Tabela: `produto`
- `id` (INT, PRIMARY KEY, AUTO_INCREMENT)
- `nome` (VARCHAR)
- `preco` (DOUBLE)

### Tabela: `pedido`
- `id` (INT, PRIMARY KEY, AUTO_INCREMENT)
- `cliente_id` (INT, FOREIGN KEY)
- `produto_id` (INT, FOREIGN KEY)
- `quantidade` (INT)
- `total` (DOUBLE)

##  Como Executar o Projeto

### Pré-requisitos

- Java JDK 8 ou superior
- MySQL 8.0 ou superior
- Apache NetBeans (ou outra IDE Java)
- Maven


##  Padrões de Projeto Utilizados

- **DAO (Data Access Object):** Separação da lógica de acesso a dados
- **MVC (Model-View-Controller):** Organização em camadas (Model, DAO, Visual)
- **Singleton (implícito):** Conexão única com o banco de dados





