import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int opcao;
        do {
            System.out.println("1-Consultar saldo, 2-Depositar, 3-Sacar, 4-Transferir, 0-Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.print("Digite o valor da transferência: ");
                    double transferencia = sc.nextDouble();
                    conta.transferir(transferencia);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}