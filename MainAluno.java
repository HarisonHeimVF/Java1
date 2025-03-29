import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        aluno.cadastrarAluno(nome, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        System.out.println("A média do aluno é: " + media);
        System.out.println("Situação: " + aluno.verificarSituacao());
    }
}