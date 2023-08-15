package semana14;

public class Retangulo {
    
    //Atributos 
    public double base, altura;

    //Construtor 
    public Retangulo(double base, double altura){

        this.base = base;
        this.altura = altura;
    }

    //Metodos 
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
    
}
