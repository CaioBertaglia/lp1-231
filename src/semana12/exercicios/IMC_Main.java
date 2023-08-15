package semana12.exercicios;

import javax.swing.JOptionPane;

public class IMC_Main {
     
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

        fMassa = Float.parseFloat(JOptionPane.showInputDialog("Peso (Kg): "));
        fAltura = Float.parseFloat(JOptionPane.showInputDialog("Altura (m) Ex: 1.70: "));


        pessoa1 = new Pessoa(fMassa, fAltura);

        fIMC = pessoa1.f_Func_IMC_Calculo();
        sFaixa = pessoa1.s_Func_getFaixa(fIMC);
        fExcesso = pessoa1.f_Func_IMC_Excesso();
        sSituacao = pessoa1.s_Func_getSituacao();

        System.out.println("Massa (Kg): " + fMassa);
        System.out.println("Altura (m): " + fAltura);
        System.out.println("IMC: " + fIMC);
        System.out.println("Classificacao: " + sFaixa);

        fAux = fExcesso;
        if (fAux < 0) fAux = - fAux;

        System.out.println("Você precisa " + sSituacao + " " +fAux + " Kg.");
        
    }

 
      
}