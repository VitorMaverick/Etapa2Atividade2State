package cenarioProcesso;

public class EmAnalise extends AbstractSituacao{
    @Override
    void indeferido(Processo processo) {
        processo.setSituacao(new Indeferido());
    }

    @Override
    void deferido(Processo processo) {
        processo.setSituacao(new Deferido());
    }
}
