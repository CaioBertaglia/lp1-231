package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class IMC_Test {
    
    @Test
    public void testef_Func_IMC_Calculo(){

        Pessoa pessoa1;
        float 
            fIMC, 
            fMassa, 
            fAltura;

        //Arrange
        pessoa1 = new Pessoa(54, (float) 1.50);

        //Act
        fIMC = pessoa1.f_Func_IMC_Calculo();

        //Assert 
        assertEquals(24.0, fIMC);

        pessoa1.setMassa((float) 61.25);
        pessoa1.setAltura((float) 1.75);

        //Act
        fIMC = pessoa1.f_Func_IMC_Calculo();

        //Assert 
        assertEquals(20.0, fIMC);

        fMassa = pessoa1.getMassa(); 
        fAltura = pessoa1.getAltura();

        //Assert 
        assertEquals(61.25, fMassa);
        assertEquals(1.75, fAltura);

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