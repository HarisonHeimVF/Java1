import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1-Registrar livro, 2-Registrar usuário, 3-Emprestar livro, 4-Devolver livro, 5-Livros emprestados, 0-Sair");
            opcao = sc.nextInt();
            sc.nextLine();  // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = sc.nextLine();
                    livros.add(new Livro(titulo, autor));
                    System.out.println("Livro registrado.");
                    break;
                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    int id = sc.nextInt();
                    usuarios.add(new Usuario(nomeUsuario, id));
                    System.out.println("Usuário registrado.");
                    break;
                case 3:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestar = sc.nextLine();
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloEmprestar) && !livro.isEmprestado()) {
                            livro.emprestar();
                            System.out.println("Livro emprestado.");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolver = sc.nextLine();
                    for (Livro livro : livros) {
                        if (livro.getTitulo().equalsIgnoreCase(tituloDevolver) && livro.isEmprestado()) {
                            livro.devolver();
                            System.out.println("Livro devolvido.");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Livros emprestados:");
                    for (Livro livro : livros) {
                        if (livro.isEmprestado()) {
                            System.out.println(livro.getTitulo());
                        }
                    }
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