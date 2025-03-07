package Questão2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Matematica mt = new Matematica();
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print(" Digite o Primeiro número");
        mt.n1 = sc.nextDouble();

        System.out.print("Digite o Segundo número");
        mt.n2 = sc.nextDouble();

        System.out.println("Digite 1 para somar, 2 para Subtrair, 3 para Multiplicar e 4 para Dividir");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("A soma dos números é ");
                mt.somar();
                System.out.println(mt.total);
                break;
            case 2:
                System.out.println("A Subtração dos números é ");
                mt.subtrair();
                System.out.println(mt.total);
                break;
            case 3:
                System.out.println("A Multiplicação dos números é");
                mt.multiplicar();
                System.out.println(mt.total);
                break;
            case 4:
                System.out.println("A Divisão dos números é");
                mt.dividir();
                System.out.println(mt.total);
                break;

            default:
                System.out.println("Inválido");
                break;
        }
    }
}
