package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class IMC_Test {
    
    @Test
    public void testef_Func_IMC_Calculo(){

        //Arrange
        Pessoa pessoa1 = new Pessoa(54, (float) 1.5);

        //Act
        float fIMC = pessoa1.f_Func_IMC_Calculo();

        //Assert 
        assertEquals(24.0, fIMC);

    }

    @Test 
    public void testes_Func_getFaixa(){

        //Arrange
        Pessoa pessoa1 = new Pessoa(54, (float) 1.5);
        
        
        //Act
        String sFaixa = pessoa1.s_Func_getFaixa(24);

        
        //Assert 
        assertEquals("Peso Normal", sFaixa);

    }

    @Test
    public void testef_Func_IMC_Excesso(){

        //Arrange
        Pessoa pessoa1 = new Pessoa(54, (float) 1.5);

        //Act
        
        String sSituacao = pessoa1.s_Func_getSituacao();

        //Assert 
        assertEquals("NORMAL", sSituacao);

    }


}