public class ContaBancaria {
    String numeroConta;
    Double saldo;

    public ContaBancaria(String numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar() {
        this.saldo += 108;
        System.out.println("Seu saldo é de: " + saldo);
    }
    public void sacar() {
        this.saldo -= 1;
        System.out.println("Seu saldo é de: " + saldo);
    }
    public static void main(String[] args) {
        ContaBancaria banco = new ContaBancaria("4454521", 0.0);
        banco.depositar();
        banco.sacar();
    }
}
