public class Main {
    public static void main(String[] args) {

        Cavalo cavalo = new Cavalo(1.8f, "Marrom", "Puro Sangue");
        System.out.println("Informações do cavalo:");
        cavalo.exibirInformacoes();
        cavalo.comer();
        cavalo.fugir();

        System.out.println();


        Leao leao = new Leao(2.1f, "Amarelo", true);
        System.out.println("Informações do leão:");
        leao.exibirInformacoes();
        leao.comer();
        leao.cacar();
    }
}