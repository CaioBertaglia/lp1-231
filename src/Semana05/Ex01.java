package Semana05;
import java.util.Scanner;
public class Ex01 {
    
public static void main(String[] args) {
    
    Double 
        fComprimento,
        fLargura,
        fAltura,
        fVolume, 
        fPotencia,
        fFiltragem,
        fTemp_Ambiente,
        fTemp_Desejada;

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira as seguintes informações a respeito do seu aquário");

    System.out.println("Comprimento do aquário (cm): ");
    fComprimento = sc.nextDouble();
    System.out.println("Largura do aquário (cm): ");
    fLargura = sc.nextDouble();
    System.out.println("Altura do aquário (cm): ");
    fAltura = sc.nextDouble();

    fVolume = (fComprimento*fAltura*fLargura)/1000;

    System.out.println("Volume do aquário (l): " + fVolume);

    System.out.println("Insira a temperatura ambiente: ");
    fTemp_Ambiente = sc.nextDouble();
    System.out.println("Insira a temperatura desejada:");
    fTemp_Desejada = sc.nextDouble();

    fPotencia = fVolume * 5/100 * (fTemp_Desejada-fTemp_Ambiente);

    System.out.println("Potência (w): " + fPotencia);

    fFiltragem = (fVolume);
    
    System.out.println("Filtragem mínima (l/h): " + fFiltragem*2);
    System.out.println("Filtragem máxima (l/h): " + fFiltragem*3);

    sc.close();

}
}