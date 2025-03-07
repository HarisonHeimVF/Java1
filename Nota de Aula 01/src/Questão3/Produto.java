package Questão3;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int num) {
        quantidade += num;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }
    public void venderProduto(int num) {
        quantidade -= num;
    }
    public void estoque() {
        System.out.println("Produto");
        System.out.println("Nome " + nome);
        System.out.println("Preço " + preco);
        System.out.println("Quantidade " + quantidade);
    }


}
