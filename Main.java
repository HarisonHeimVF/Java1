import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matematica mat = new Matematica();

        System.out.println("Escolha a operação: 1-Soma, 2-Subtração, 3-Divisão, 4-Multiplicação");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + mat.soma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + mat.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + mat.divisao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + mat.multiplicacao(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}