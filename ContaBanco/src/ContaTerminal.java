import java.util.Scanner;
public class ContaTerminal {
  public static void main(String[] args) {
    //Declarando variaveis
     String nomeCliente, agencia;
     double saldo;
     int numeroConta;
    Scanner ler1 = new Scanner(System.in);
    Scanner ler2 = new Scanner(System.in);
    
    //Obtendo dados iniciais do cliente
    System.out.println("Entrando na sua conta.");
    System.out.println("Digite o número da sua agencia:");
    agencia = ler1.nextLine();
    System.out.println("Digite o número da sua conta:");
    numeroConta = ler1.nextInt();
    System.out.println("Digite o seu nome completo:");
    nomeCliente = ler2.nextLine();
    System.out.println("Digite o valor que voçe deseja depositar:");
    saldo = ler2.nextDouble();

    System.out.print("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", e sua conta e "+numeroConta+", e seu saldo e de " +saldo+ " já esta disponivel para saque.");
  }

}

