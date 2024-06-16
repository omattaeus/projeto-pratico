import java.util.ArrayList;
import java.util.List;

public class GerenciamentoInventario {

    static List<Produto> inventario = new ArrayList<>();

    static void AdicionarProduto(String nome, int quantidade) {
        Produto novoProduto = new Produto(nome, quantidade);
        inventario.add(novoProduto);
    }

    static void RemoverProduto(String nome) {
        for (Produto produto : inventario) {
            if (produto.nome.equals(nome)) {
                inventario.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado no inventário.");
    }

    static void ListarProdutos() {
        System.out.println("Produtos no inventário:");
        for (Produto produto : inventario) {
            System.out.println(produto.nome + " - Quantidade: " + produto.quantidade);
        }
    }

    static void BuscarProduto(String nome) {
        for (Produto produto : inventario) {
            if (produto.nome.equals(nome)) {
                System.out.println("Produto encontrado:");
                System.out.println(produto.nome + " - Quantidade: " + produto.quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no inventário.");
    }
}
