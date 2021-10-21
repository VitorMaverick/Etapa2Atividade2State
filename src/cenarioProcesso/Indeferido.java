package cenarioProcesso;

public class Indeferido extends AbstractSituacao {
    @Override
    public void enviarEmail() {
        System.out.println("Indeferido com sucesso, E-mail enviado!");
    }

    @Override
    void fechado(Processo processo) {
        processo.setSituacao(new Fechado());
    }
}
