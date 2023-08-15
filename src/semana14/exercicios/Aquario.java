package semana14.exercicios;

public class Aquario {

    private float fComprimento; 
    private float fLargura;
    private float fAltura;; 

    public Aquario(
        float fComp, 
        float fLarg, 
        float fAlt 
        ) 
    {
        this.fComprimento = fComp;   
        this.fLargura = fLarg;
        this.fAltura = fAlt;
    }

    public Aquario(
        float fComp
        ) 
    {
        this.fComprimento = fComp;   
        this.fLargura = fComp;
        this.fAltura = fComp;
    }

    public float getComprimento(){
        return fComprimento;
    }

    public float getLargura(){
        return fLargura;
    }
    
    public float getAltura(){
        return fAltura;
    }

   public void setComprimento(float fComp){

        if(fComp <= 0.0){
            throw new RuntimeException("Comprimento Inválido");
        }

        this.fComprimento = fComp;
    }

    public void setLargura(float fLarg){

        if(fLarg <= 0.0){
            throw new RuntimeException("Largura Inválida");
        }

        this.fLargura = fLarg;
    }

    public void setAltura(float fAlt){

        if(fAlt <= 0.0){
            throw new RuntimeException("Altura Inválida");
        }

        this.fAltura = fAlt;
    }

    public float f_Func_CalcularVolume () 
    {

        float fVolume;

        fVolume = this.fComprimento * this.fLargura * this.fAltura / 1000;

        return fVolume;

    }

    public float f_Func_CalcularPotenciaDoTermostato (
        float fVolume, 
        float fTemp_Desejada, 
        float fTemp_Ambiente 
        ) {

        float 
            fPotencia;

        fPotencia = fVolume * 5/100 * (fTemp_Desejada-fTemp_Ambiente);

        return fPotencia;

    }

    public  float f_Func_CalculaQuantidadeLitrosFiltro (
        float fVolume, 
        float fMultiplicador 
        ) {

        float 
            fFiltragem;

            fFiltragem = fVolume * fMultiplicador;

        return fFiltragem;

    }

}