public class Animal {
    protected float tamanho;
    protected String cor;


    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }


    public void comer() {
        System.out.println("O animal está comendo.");
    }


    public void exibirInformacoes() {
        System.out.println("Tamanho: " + tamanho + " metros");
        System.out.println("Cor: " + cor);
    }
}
