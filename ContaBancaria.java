
class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void transferir(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência de R$" + valor + " realizada.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}