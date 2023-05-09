package Semana05;

import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {

        float
            fMassa,
            fAltura,
            fIMC,
            fDif;

        String
            sMsg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Peso (kg):");
        fMassa = sc.nextFloat();
        System.out.println("Altura (m):");
        fAltura = sc.nextFloat();

        fIMC = fMassa / (fAltura*fAltura);

        if (fIMC<18.5){
            sMsg = "Baixo peso";
        }
        else if(fIMC<24.9){
            sMsg = "Peso normal";
        } 
        else if (fIMC<29.9){
            sMsg = "Excesso de peso";
        } 
        else if (fIMC<34.9){
            sMsg = "Obesidade de classe 1";
        }
        else if (fIMC<39.9){
            sMsg = "Obesidade de classe 2";
        } 
        else{
            sMsg = "Obesidade de classe 3";
        }

        System.out.println("Massa (kg): " + fMassa);
        System.out.println("Altura (m): " + fAltura);
        System.out.println("IMC: " + fIMC);
        System.out.println("Classificação: " + sMsg);
        
        if (fIMC < 18.5 ) {
            fDif = (float) (18.5 * (fAltura * fAltura)) - fMassa;
            System.out.println("Voce precisa ganhar: " + fDif + " Kg.");
        }

        else if (fIMC > 24.9){
            fDif = fMassa - (float) (24.9 * (fAltura * fAltura));
            System.out.println("Voce precisa perder: " + fDif + " Kg.");
        }

        sc.close();
    }
}