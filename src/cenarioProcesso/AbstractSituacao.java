package cenarioProcesso;

public abstract class AbstractSituacao {
    public void enviarEmail() {
        System.out.println("Não foi possivel avisar ainda..");
    }

     void indeferido(Processo processo) {
        throw new RuntimeException();
    }
     void deferido(Processo processo) {
        throw new RuntimeException();
    }
     void fechado(Processo processo) {
        throw new RuntimeException();
    }
}
