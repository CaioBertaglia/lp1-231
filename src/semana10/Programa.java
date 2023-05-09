package semana10;

    //Classe
class Retangulo {

    //Atributos
    public double base;
    public double altura;
    //Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}



public class Programa {
    public static void main(String[] args) {
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);
        
        String palavra = "abc";
        Retangulo ret1 = new Retangulo();
        ret1.base = 30.0;
        ret1.altura = 100.0;


        
        Retangulo ret2 = new Retangulo();
        ret2.base = 30.0;
        ret2.altura = 100.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());


    }

        // area = base * altura
        public static double calcularArea(double base, double altura) {
            return base * altura;
        }
        
    }



