package cenarioContaBancaria;

public class Negativo extends AbstractEstado{
    @Override
    public void saque(ContaBancaria conta, double valor) {
        System.out.println("Não foi possivel, verifique seu saldo");
    }

    @Override
    public void deposito(ContaBancaria conta, double valor) {
        double valorFinal = valor * 0.95;
        conta.efetuaDeposito(valorFinal);
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    void positivo(ContaBancaria conta) {
        conta.setEstado(new Positivo());
    }
}
