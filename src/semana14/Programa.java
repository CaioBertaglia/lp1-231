package semana14;

public class Programa {
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.00);

        quadrado.setLado(5.6);

        System.out.println(quadrado.getLado());
        
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(10.0, 5.0);
        
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());        

        Circulo circulo = new Circulo(5);
     
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

    }

}
