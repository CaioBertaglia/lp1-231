package semana20;

import java.util.List;

public class QuestoesME extends Questoes {
        private List respostasCorretas; 

        public QuestoesME(int numero, String enunciado, List respostasCorretas) 
        { 
            super(numero, enunciado); 
            this.respostasCorretas = respostasCorretas; 
        } 

        @Override 
        
        public boolean validarResposta(String resposta) 
        { 
            return respostasCorretas.contains(resposta); 
        } 

        @Override 
        public int getPontuacao() 
        { 
            return respostasCorretas.size(); 
        }
    }