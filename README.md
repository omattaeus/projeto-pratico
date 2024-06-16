# Projeto Prático | Sistema de Gerenciamento de Loja
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) </br>

--------


### SOBRE
O Sistema de Gerenciamento de Loja consiste em cadastrar produtos, buscar produtos, listar produtos e remover produtos, no qual podemos estar removendo por nome, buscando por todos os produtos
e buscar por nome.

# Entendendo decisões arquiteturais e a estrutura do projeto

## Requisitos para rodar o projeto

### Setup de ambiente:

- [Java 21](https://www.java.com/pt-BR/)
  - Instalar [`Java 21`](https://www.oracle.com/br/java/technologies/downloads/#java21)
   
### Como rodar na minha máquina?

- Clone o projeto `git clone https://github.com/omattaeus/projeto-pratico.git`
  
- Rode `javac Main.java`
- Depois Rode `java Main`
- Pronto 🎉

### Estrutura do projeto

- `./src`: É onde você pode encontrar todas as classes do projeto.
  
### Classes
- `Produto`: É onde você pode encontrar todos os atributos necessário para Produtos, como nome e quantidade juntamente com seu construtor.
- `GerenciamentoInventario`: É onde você pode encontrar a lógica do sistema, como métodos: AdicionarProduto, RemoverProduto, ListarProdutos e BuscarProduto.
- `Main`: É onde você pode encontrar o ponto de partida do sistema é onde podemos ter o menu de opção, como:


        ====== BEM VINDO AO GERENCIAMENTO DE INVENTÁRIO ======
        Selecione a opção: 
        [1] - Adicionar Produto
        [2] - Listar Produtos
        [3] - Remover Produto
        [4] - Buscar Produto
        [5] - Sair do Programa
        Digite a opção: 
