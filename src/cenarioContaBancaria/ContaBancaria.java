package cenarioContaBancaria;

public class ContaBancaria {
    long numer;
    double saldo;
    AbstractEstado estado;

    public ContaBancaria(long numer) {
        this.saldo = 0;
        this.numer = numer;
        this.estado = new Positivo();
    }
    public void depoista(double valor) {
        this.estado.deposito(this, valor);
    }
    public void saca(double valor) {
        this.estado.saque(this, valor);
    }

    void efetuaSaque(double valor) {
        this.saldo -=  valor;
        if(this.saldo<0) {
            this.estado.negativo(this);
        }
    }
    void efetuaDeposito(double valor) {
        this.saldo += valor;
    }

    public void setEstado(AbstractEstado estado) {
        this.estado = estado;
    }
}
