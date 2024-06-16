import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    buscarProduto();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    return;
                default:
                    System.out.println("Opção incorreta! Por favor, escolha uma opção válida.");
            }
        }
    }

    static void menu() {
        System.out.println("\n====== BEM VINDO AO GERENCIAMENTO DE INVENTÁRIO ======");
        System.out.println("Selecione a opção: ");
        System.out.println("[1] - Adicionar Produto");
        System.out.println("[2] - Listar Produtos");
        System.out.println("[3] - Remover Produto");
        System.out.println("[4] - Buscar Produto");
        System.out.println("[5] - Sair do Programa");
        System.out.print("Digite a opção: ");
    }

    static void adicionarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a quantidade do produto: ");
        int qtdProduto = scanner.nextInt();

        GerenciamentoInventario.AdicionarProduto(nomeProduto, qtdProduto);

        System.out.println("Produto adicionado com sucesso!");
    }

    static void listarProdutos() {
        GerenciamentoInventario.ListarProdutos();
    }

    static void removerProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto que deseja remover: ");
        String nomeProduto = scanner.nextLine();

        GerenciamentoInventario.RemoverProduto(nomeProduto);

        System.out.println("Produto removido com sucesso!");
    }

    static void buscarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto que deseja buscar: ");
        String nomeProduto = scanner.nextLine();

        GerenciamentoInventario.BuscarProduto(nomeProduto);
    }
}