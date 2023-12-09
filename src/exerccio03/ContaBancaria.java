package exerccio03;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String novoTitular) {
        titular = novoTitular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double calcularInvestimento(int anos) {
        double taxa = 0.07; // 7% a.a

        return saldo * Math.pow(1 + taxa, anos);
    }
}
