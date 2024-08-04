import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCliente = sc.next();
        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o número da Agência:");
        String agenciaConta = sc.next();
        System.out.println("Quanto você quer depositar ?");
        double saldoConta = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo de R$"+saldoConta+" já está disponível para saque.");

    }
}
