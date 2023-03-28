package semana06;

    public class Metodos {
    
        public static void main(String[] args) {
            System.out.println(Math.sqrt(25.0));
            imprimirPalavra("Olá Mundo!");
            
            double soma = somar  (10.0, 2.3);
            System.out.println(soma);
    
            System.out.println(somar(3.3, 4.1));
            
    
            }
    
        //Metodo que soma dois numeros e retorna o resultado
        public static double somar (double n1, double n2) {
            double soma = n1 + n2;
            return soma;
         } 
        
        //Assinatura do metodo
        //public - acesso em qualquer parte do projeto
        //static - metodo atrelado a classe (não precisa criar um objeto)
        //void - tipo de retorno (Sem retorno)
        //ImprimirPalavra - nome do metodo
        //String palavra - pârametro (pode ter zero ou muitos)
        //Definindo o metodo
        public static void imprimirPalavra(String palavra) {
            System.out.println(palavra.toUpperCase());
        }
    
    
    }

        