import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Produto produto = new Produto(1, "Notebook", "15 polegadas", "Prata", 3000.00, 10);
        produto.exibirProduto();

        System.out.print("Quantas unidades deseja comprar? ");
        int quantidade = sc.nextInt();

        if (produto.venderProduto(quantidade)) {
            Pagamento.realizarPagamento(produto, quantidade);
            System.out.println("Estoque atual: " + produto.getQuantidadeEstoque());
        } else {
            System.out.println("Venda não realizada.");
        }
    }
}
