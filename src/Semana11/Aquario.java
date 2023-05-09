package Semana11;

public class Aquario {

    Double 
        altura,
        largura,
        comprimento,
        tempAmbiente,
        tempDesejada,
        volume,
        filtragem,
        filtragemMinima,
        filtragemMaxima,
        potencia;

    public double calcularVolume(){
        return volume = (altura * comprimento * largura)/1000;
    }      

    public double calcularPotenciaDoTermostato() {
        return potencia = volume * 5/100 * (tempDesejada - tempAmbiente);
    }

    public double calcularQuantidadeMinimaLitrosFiltro(){
        filtragem = volume;
        return filtragemMinima = filtragem * 2;
    }

    public double calcularQuantidadeMaximaLitrosFiltro(){
        filtragem = volume;
        return filtragemMaxima = filtragem * 3;
    }
}

