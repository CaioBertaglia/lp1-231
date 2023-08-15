package semana14.exercicios;

public class Conta_Teste {
    
    public static void main(String[] args) {

        Conta ContaOrigem;
        Conta ContaDestino;

        ContaOrigem = new Conta(1, "Claudio");
        ContaDestino = new Conta(2, "Arthur");

        ContaOrigem.Proc_Depositar(1000.00);
        ContaDestino.Proc_Depositar(100.00);

        ContaOrigem.imprimirDados();
        ContaDestino.imprimirDados();

        ContaOrigem.Proc_Transferir(ContaDestino, 150.00);
    
        ContaOrigem.imprimirDados();
        ContaDestino.imprimirDados();

    }


      
}