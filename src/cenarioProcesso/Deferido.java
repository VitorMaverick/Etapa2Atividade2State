package cenarioProcesso;

public class Deferido extends AbstractSituacao {
    @Override
    public void enviarEmail() {
        System.out.println("Deferido com sucesso, E-mail enviado!");
    }

    @Override
    void fechado(Processo processo) {
        processo.setSituacao(new Fechado());
    }
}
