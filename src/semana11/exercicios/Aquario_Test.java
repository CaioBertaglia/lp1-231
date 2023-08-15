package semana12.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aquario_Test {
    
    @Test
    public void testeCalcularVolume(){

        //Arrange
        Aquario aquario = new Aquario(100, 50, 50);

        //Act
        float fVolume = aquario.f_Func_CalcularVolume();

        //Assert 
        assertEquals(250.00, fVolume);

    }

    @Test
    public void testeCalcularPotenciaDoTermostato(){
        //Arrange
        Aquario aquario = new Aquario(100, 50, 50);
        
        float fTemp_Ambiente = 26;
        float fTemp_Desejada = 34;

        //Act
        float fVolume = aquario.f_Func_CalcularVolume();

        double potencia = 
            aquario.f_Func_CalcularPotenciaDoTermostato(
                fVolume, 
                fTemp_Desejada, 
                fTemp_Ambiente );

        //Assert 
        assertEquals(100.00, potencia);

    }

    @Test
    public void testeCalcularQuantidadeMinimaLitrosFiltro(){
        //Arrange
        Aquario aquario = new Aquario(100, 50, 50);
        float fFiltragem = 250;

        //Act
        float fVolume = aquario.f_Func_CalcularVolume();

        float fFiltragem_Min = aquario.f_Func_CalculaQuantidadeLitrosFiltro(
            fVolume, 
            2
        );



        //Assert 
        assertEquals(500, fFiltragem_Min);

    }

    @Test
    public void testeCalcularQuantidadeMaximaLitrosFiltro(){
        //Arrange
        Aquario aquario = new Aquario(100, 50, 50);
        float fFiltragem = 250;

        //Act
        float fVolume = aquario.f_Func_CalcularVolume();

        float fFiltragem_Max = aquario.f_Func_CalculaQuantidadeLitrosFiltro (
            fVolume, 
            3
        );

        //Assert 
        assertEquals(750, fFiltragem_Max);

    }

}