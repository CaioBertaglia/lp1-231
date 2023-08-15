package semana14.exercicios;

public class Pessoa {
    
    private float fMassa;
    private float fAltura;
    

    public Pessoa(
        float fMassa,  
        float fAltura 
        ) 
    {
        this.fMassa = fMassa;   
        this.fAltura = fAltura;
    }

    public float getMassa(){
        return fMassa;
    }
    
    public float getAltura(){
        return fAltura;
    }

   public void setMassa(float fMassa){

        if(fMassa <= 0.0){
            throw new RuntimeException("Massa Inválida");
        }

        this.fMassa = fMassa;
    }

    public void setAltura(float fAltura){

        if(fAltura <= 0.0){
            throw new RuntimeException("Altura Inválida");
        }

        this.fAltura = fAltura;
    }

    public float f_Func_IMC_Calculo ( ) {

        float 
            fIMC;

        fIMC = fMassa / fAltura / fAltura;

        return fIMC;

    }

    public String s_Func_getFaixa (
        float fIMC 
        ) {

        String  
            sMsg;

        if (fIMC < 18.5)        sMsg = "Baixo peso";
        else if (fIMC < 24.9)   sMsg = "Peso Normal";
        else if (fIMC < 29.9)   sMsg = "Excesso de Peso";
        else if (fIMC < 34.9)   sMsg = "Obesidade Classe 1";
        else if (fIMC < 39.9)   sMsg = "Obesidade Classe 2";
        else                    sMsg = "Obesidade Classe 3";
    
        return sMsg;

    }

    public float f_Func_IMC_Excesso () {

        float 
            fExcesso,
            fAux;

        fExcesso = 0;

        fAux = (float) (18.5 * fAltura * fAltura);

        if (fMassa < fAux) fExcesso = fMassa - fAux;

        fAux = (float) (24.9 * fAltura * fAltura);

        if (fMassa > fAux) fExcesso = fMassa - fAux;
             
        return fExcesso;

    }


    public String s_Func_getSituacao() {

        float fExcesso;
        String sAux;

        fExcesso = f_Func_IMC_Excesso();

        sAux = "NORMAL";

        if (fExcesso > 0){
            sAux = "PERDER";
        }

        if (fExcesso < 0){
            sAux = "GANHAR";
        }
            
        return sAux;

    }

}