package semana14.exercicios;

import javax.swing.JOptionPane;

public class Aquario_Main {
    
    public static void main(String[] args) {
        
        float 
            fComprimento, 
            fLargura, 
            fAltura,
            fVolume,
            fPotencia,
            fTemp_Ambiente,
            fTemp_Desejada,
            fFiltragem_Min,
            fFiltragem_Max;

        Aquario aquario1;

        fComprimento = Float.parseFloat(JOptionPane.showInputDialog("Comprimento (cm): "));
        fLargura = Float.parseFloat(JOptionPane.showInputDialog("Largura (cm): "));
        fAltura = Float.parseFloat(JOptionPane.showInputDialog("Altura (cm): "));
        fTemp_Ambiente = Float.parseFloat(JOptionPane.showInputDialog("Temperatura Ambiente (oC): "));
        fTemp_Desejada = Float.parseFloat(JOptionPane.showInputDialog("Temperatura Desejada (oC): "));

        aquario1 = new Aquario(fComprimento, fLargura, fAltura);            


        fVolume = aquario1.f_Func_CalcularVolume();

        fPotencia = aquario1.f_Func_CalcularPotenciaDoTermostato(
            fVolume, 
            fTemp_Desejada, 
            fTemp_Ambiente 
        );

        fFiltragem_Min = aquario1.f_Func_CalculaQuantidadeLitrosFiltro(
            fVolume, 
            2
        );

        fFiltragem_Max = aquario1.f_Func_CalculaQuantidadeLitrosFiltro (
            fVolume, 
            3
        );

        System.out.println("Comprimento (cm): " + aquario1.getComprimento());
        System.out.println("Largura (cm): " + aquario1.getLargura());
        System.out.println("Altura (cm): " + aquario1.getAltura());
        System.out.println("Temperatura Ambiente (oC): " + fTemp_Ambiente);
        System.out.println("Temperatura Desejada (oC): " + fTemp_Desejada);
        System.out.println("Volume (l): " + fVolume);
        System.out.println("Potencia (W): " + fPotencia);
        System.out.println("Filtragem Mínima (l/h): " + fFiltragem_Min);
        System.out.println("Filtragem Máxima (l/h): " + fFiltragem_Max);
         
        aquario1.setComprimento(30);
        aquario1.setLargura(25);
        aquario1.setAltura(15);

        System.out.println("Comprimento (cm): " + aquario1.getComprimento());
        System.out.println("Largura (cm): " + aquario1.getLargura());
        System.out.println("Altura (cm): " + aquario1.getAltura());
     }
  
}