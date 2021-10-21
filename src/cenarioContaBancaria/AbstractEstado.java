package cenarioContaBancaria;



public abstract class AbstractEstado {
    public abstract void saque(ContaBancaria conta, double valor);
    public abstract void deposito(ContaBancaria conta, double valor);

    void positivo(ContaBancaria conta) { throw new RuntimeException(); }
    void negativo(ContaBancaria conta) {
        throw new RuntimeException();
    }
}
