package cenarioContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1010);
        conta.depoista(10);
        conta.saca(100);
        conta.saca(100);
    }
}
