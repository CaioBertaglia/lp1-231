package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void somaDoisNumerosPositivos() {
        // AAA
        //Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        //Act
        double soma = Calculadora.somar (n1, n2);

        //Assert
        assertEquals(12.0, soma);
    }
    @Test
    public void somaUmNumeroPositivoEUmNumeroNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;

    
        double soma = Calculadora.somar (n1, n2);

        
        assertEquals(12.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;

    
        double soma = Calculadora.somar (n1, n2);

        
        assertEquals(-12.0, soma);
    }

    @Test
    public void DividirDoisNumerosPositivos() {
        double n1 = 10.0;
        double n2 = 2.0;

    
        double divisão = Calculadora.divisão(n1, n2);

        
        assertEquals(5.0, divisão);
    }
    @Test
    public void MultiplicarDoisNumerosPositivos() {
        double n1 = 10.0;
        double n2 = 2.0;

    
        double multiplicação = Calculadora.multiplicação(n1, n2);

        
        assertEquals(20.0, multiplicação);
    }
}


