import java.util.Scanner;

public class simulandoBanco {
    public static void main(String[] args){
        System.out.println("########## Abrindo uma conta bancária ##########");
        
        Scanner terminal = new Scanner(System.in);
        System.out.println("Escolha número da sua conta: ");
        int conta = terminal.nextInt();
        
        System.out.println("Escolha sua agência: ");
        int agencia = terminal.nextInt();
        
        System.out.println("Nome completo: ");
        String nome = terminal.nextLine();
        
        System.out.println("Entre com seu saldo: ");
        double saldo = terminal.nextDouble();

        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);

        terminal.close();

    }
}
