import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o codigo da sua agencia: ");
        String agencia =  scanner.nextLine();

        System.out.println("Digite seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldoCliente = scanner.nextDouble();

        scanner.close();

        System.out.println("Ola, "+nomeCliente+", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agencia eh a "+ agencia +", conta "+ numeroConta +". O seu saldo atual eh "+ saldoCliente+ ", ja disponivel para saque");
    }
}
