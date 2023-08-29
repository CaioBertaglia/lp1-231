package semana21;

public class Main{

    //interface = contrato
    //conjunto de metodos (somente assinatura, sem corpo)
    //classe concreta que implementa a interface

    public static void main(String[] args){
        System.out.println("Main...");
    
        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        
        Retangulo r1 = new Retangulo(10, 5);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());
    }

}