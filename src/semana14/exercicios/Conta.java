package semana14.exercicios;

public class Conta {
    
    private final int iCodigo;
    private final String sCorrentista;
    private double dSaldo;
    
    public Conta(
        int iCodigo,
        String sNome
        ) 
    {
        int iTamanho;
        
        if (iCodigo < 0) {
            System.out.println(iCodigo);
            throw new RuntimeException("Codigo Inválido");
        }
             
        iTamanho = sNome.length();
        
        if (iTamanho < 5 || iTamanho > 100) {
            System.out.println(sNome);
            throw new RuntimeException
            ("O nome do correntista deve ter no minimo 5 " +
            "e no maximo 100 caracteres");
        }
        
        this.iCodigo = iCodigo;   
        this.sCorrentista = sNome;
        this.dSaldo = 0.0;
    }



    public void Proc_Depositar(
        double dValor
        ) 
    {
        this.dSaldo = this.dSaldo + dValor;
    }

    public void Proc_Sacar(
        double dValor
        ) 
    {
        this.dSaldo = this.dSaldo - dValor;
    }

    public void Proc_Transferir(
        Conta contaDestino,
        double dValor
        ) 
    {
        this.Proc_Sacar(dValor);
        contaDestino.Proc_Depositar(dValor);
    } 

    // método que imprime todos os dados da conta
    public void imprimirDados(){
        System.out.print("\n\nCodigo: " +  this.iCodigo );
        System.out.print("\nCorrentista: " +  this.sCorrentista );
        System.out.print("\nSaldo: " +  this.dSaldo );
    }
    
}