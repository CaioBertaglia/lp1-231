package semana20;

public abstract class Questoes { 
   
    private int numero; 
    private String enunciado; 
    
    public Questoes(int numero, String enunciado){ 
        this.numero = numero; 
        this.enunciado = enunciado;
     }

      public boolean validarResposta(String resposta){ 
        return false;
    } 

    public abstract int getPontuacao();

    public void mostrarEnunciado(){ 
        System.out.println(numero + ". " + enunciado); 
    }
}