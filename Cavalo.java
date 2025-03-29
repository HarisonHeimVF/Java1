public class Cavalo extends Animal {
    private String raca;

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir() {
        System.out.println("O cavalo da raça " + raca + " está fugindo.");
    }


    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Raça: " + raca);
    }
}
