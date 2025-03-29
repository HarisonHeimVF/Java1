import java.util.Scanner;

public class Pagamento {
    public static void realizarPagamento(Produto produto, int quantidade) {
        Scanner sc = new Scanner(System.in);

        double valorTotal = produto.getValor() * quantidade;

        System.out.println("Formas de pagamento disponíveis:");
        System.out.println("1 - Pix");
        System.out.println("2 - Espécie");
        System.out.println("3 - Transferência");
        System.out.println("4 - Débito");
        System.out.println("5 - Crédito (Parcelado em 3x)");

        System.out.print("Escolha a forma de pagamento: ");
        int opcaoPagamento = sc.nextInt();

        switch (opcaoPagamento) {
            case 1:
            case 3:
            case 4:
                valorTotal *= 0.95;
                System.out.println("Valor com desconto: R$ " + valorTotal);
                break;
            case 2:
                valorTotal *= 0.95;
                System.out.println("Valor com desconto: R$ " + valorTotal);
                System.out.print("Digite o valor pago: ");
                double valorPago = sc.nextDouble();
                if (valorPago >= valorTotal) {
                    double troco = valorPago - valorTotal;
                    System.out.println("Troco: R$ " + troco);
                } else {
                    System.out.println("Valor insuficiente para realizar a compra.");
                    return;
                }
                break;
            case 5:
                System.out.println("Pagamento parcelado em 3x de R$ " + (valorTotal / 3));
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Pagamento realizado com sucesso.");
    }
}
