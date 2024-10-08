package Questao1;

class ContaCorrente extends Conta {
    private final double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saldo insuficiente, mesmo considerando o cheque especial!");
        }
    }
}
