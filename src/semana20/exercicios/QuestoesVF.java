package semana20;

public class QuestoesVF extends Questoes {

    //Questoes Verdadeiro/Falso

    private boolean resposta;

    public QuestoesVF(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean getResposta() {
        return resposta;
    }
}