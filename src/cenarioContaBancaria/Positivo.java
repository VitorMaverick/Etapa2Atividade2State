package cenarioContaBancaria;

import cenarioProcesso.Processo;

public class Positivo extends AbstractEstado {
    @Override
    public void saque(ContaBancaria conta, double valor) {
        conta.efetuaSaque(valor);
        System.out.println("Saque realizado com sucesso!");
    }

    @Override
    public void deposito(ContaBancaria conta, double valor) {
        double valorFinal = valor * 0.98;
        conta.efetuaDeposito(valorFinal);
        System.out.println("Deposito realizado com sucesso!");
    }

    @Override
    void negativo(ContaBancaria conta) {
        conta.setEstado(new Negativo());
    }
}
