package Questão1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno al = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Primeira nota");
        al.n1 = sc.nextDouble();

        System.out.println("Digite a Segunda nota");
        al.n2 = sc.nextDouble();

        System.out.println("Digite a Terceira nota");
        al.n3 = sc.nextDouble();

        System.out.print("A sua média é ");
        al.calculo_media();

    }
}