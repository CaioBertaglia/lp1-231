package semana12.exercicios;

public class Conta_Teste {
    
    public static void main(String[] args) {
        
        int iCodigo;
        String sCorrentista;
        Double dSaldo;
        

        Conta ContaOrigem;
        Conta ContaDestino;

        ContaOrigem = new Conta(1, "Claudio");
        ContaDestino = new Conta(2, "Bruno");

        ContaOrigem.Proc_Deposito(1000.00);
        ContaDestino.Proc_Deposito(100.00);

        ContaOrigem.imprimirDados();
        ContaDestino.imprimirDados();

        Proc_Trasferencia(ContaOrigem, ContaDestino, 150.00);
    
        ContaOrigem.imprimirDados();
        ContaDestino.imprimirDados();
        

    }

    public static void Proc_Trasferencia(
        Conta contaOrigem,
        Conta contaDestino,
        double dValor
        ) 
    {
        contaOrigem.Proc_Saque(dValor);
        contaDestino.Proc_Deposito(dValor);
    } 
      
}