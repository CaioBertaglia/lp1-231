package semana14.exercicios;

public class IMC_Teste {
    
    public static void main(String[] args) {
        
        float 
            fMassa, 
            fAltura,
            fIMC,
            fAux,
            fExcesso;

    
        String  
            sFaixa,
            sSituacao;

        Pessoa pessoa1;

        fMassa = 54;
        fAltura = (float)1.5;

        pessoa1 = new Pessoa(fMassa, fAltura);

        fIMC = pessoa1.f_Func_IMC_Calculo();
        sFaixa = pessoa1.s_Func_getFaixa(fIMC);
        fExcesso = pessoa1.f_Func_IMC_Excesso();
        sSituacao = pessoa1.s_Func_getSituacao();

        System.out.println("Massa (Kg): " + pessoa1.getMassa());
        System.out.println("Altura (m): " + pessoa1.getAltura());
        System.out.println("IMC: " + fIMC);
        System.out.println("Classificacao: " + sFaixa);

        fAux = fExcesso;
        if (fAux < 0) fAux = - fAux;

        System.out.println("Você precisa " + sSituacao + " " +fAux + " Kg.");
        
        pessoa1.setMassa(72);
        pessoa1.setAltura(165);

        System.out.println("Massa (Kg): " + pessoa1.getMassa());
        System.out.println("Altura (m): " + pessoa1.getAltura());
        
    }

 
      
}