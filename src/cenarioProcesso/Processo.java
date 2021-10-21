package cenarioProcesso;

public class Processo {
    AbstractSituacao situacao;

    public Processo() {
        this.situacao = new EmAnalise();
    }

    public void setSituacao(AbstractSituacao situacao) {
        this.situacao = situacao;
    }
    public void AvisarInteressado() {
        situacao.enviarEmail();
    }

}
