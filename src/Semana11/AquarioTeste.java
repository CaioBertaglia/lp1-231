package Semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste {
    
    @Test
    public void testeCalcularVolume(){
        //Arrange
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.0;
        aquario.altura = 50.0;
        aquario.largura = 50.0;

        //Act
        double volume = aquario.calcularVolume();

        //Assert 
        assertEquals(250.00, volume);

    }

    @Test
    public void testePotenciaDoTermostato(){
        //Arrange
        Aquario aquario = new Aquario();
        aquario.volume = 250.0;
        aquario.tempAmbiente = 26.0;
        aquario.tempDesejada = 34.0;

        //Act
        double potencia = aquario.volume * 5/100 * (aquario.tempDesejada - aquario.tempAmbiente);

        //Assert 
        assertEquals(100.00, potencia);

    }

    @Test
    public void testeCalcularQuantidadeMinimaLitrosFiltro(){
        //Arrange
        Aquario aquario = new Aquario();
        aquario.filtragem = 250.0;

        //Act
        double filtragemMinima = aquario.filtragem * 2;

        //Assert 
        assertEquals(500.00, filtragemMinima);

    }

    @Test
    public void testeCalcularQuantidadeMaximaLitrosFiltro(){
        //Arrange
        Aquario aquario = new Aquario();
        aquario.filtragem = 250.0;

        //Act
        double filtragemMaxima = aquario.filtragem * 3;

        //Assert 
        assertEquals(750.00, filtragemMaxima);

    }

}
