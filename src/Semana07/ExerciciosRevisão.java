package Semana07;

import java.util.jar.Manifest;

import org.junit.jupiter.api.MethodOrderer;

public class ExerciciosRevisão {


    @Test
        public void somaTrêsNumerosPositivos() {
           
            double n1 = 10.0;
            double n2 = 2.0;
            double n3 = 5.0;    
            
            double soma = Calculadora.somar (n1, n2);
    
            
            assertEquals(12.0, soma);

        
     

    

}

       
    }

