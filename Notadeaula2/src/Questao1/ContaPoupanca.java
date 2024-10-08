package Questao1;

class ContaPoupanca extends Conta {
    private double selic;

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.printf("Rendimento de R$ %.2f calculado e adicionado ao saldo.\n", rendimento);
    }
}