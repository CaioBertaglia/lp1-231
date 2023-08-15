package semana12.exercicios;

public class Conta {
    
    private int codigo;
    private String correntista;
    private Double saldo;
    

    public Conta(
        int iCodigo,
        String sCorrentista
        ) 
    {
        this.codigo = iCodigo;   
        this.correntista = sCorrentista;
        this.saldo = 0.0;
    }

    public void Proc_Deposito(
        double dValor
        ) 
    {
        this.saldo = this.saldo + dValor;
    }

    public void Proc_Saque(
        double dValor
        ) 
    {
        this.saldo = this.saldo - dValor;
    }



    // método que imprime todos os dados da conta
    public void imprimirDados(){
        System.out.print("\n\nCodigo: " +  this.codigo );
        System.out.print("\nCorrentista: " +  this.correntista );
        System.out.print("\nSaldo: " +  this.saldo );
    }
    
}