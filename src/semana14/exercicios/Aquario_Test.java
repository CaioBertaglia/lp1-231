package semana14.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aquario_Test {
    
    @Test
    public void testeSeteGet(){

        Aquario aquario1;
        float 
            fComprimento, 
            fLargura, 
            fAltura,
            fVolume;


        //Arrange
        aquario1 = new Aquario(100);

        //Act
        fVolume = aquario1.f_Func_CalcularVolume();

        //Assert 
        assertEquals(1000.00, fVolume);

        aquario1.setComprimento(30);
        aquario1.setLargura(25);
        aquario1.setAltura(15);

        //Act
        fVolume = aquario1.f_Func_CalcularVolume();

        fComprimento = aquario1.getComprimento(); 
        fLargura = aquario1.getLargura(); 
        fAltura = aquario1.getAltura();

        //Assert 
        assertEquals(11.25, fVolume);
        assertEquals(30, fComprimento);
        assertEquals(25, fLargura);
        assertEquals(15, fAltura);

    }

    @Test
    public void testeCalcularVolumeCubo(){
        //Arrange
        Aquario aquario = new Aquario(100);

        //Act
        float fVolume = aquario.f_Func_CalcularVolume();

        //Assert 
        assertEquals(1000.00, fVolume);
    }
    
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