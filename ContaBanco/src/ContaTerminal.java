import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // os argumentos começam com indice 0
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // String nome = args[0];
        // int agencia = Integer.valueOf(args[1]);
        // int numero = Integer.valueOf(args[2]); // vamos falar sobre Wrappers
        // double saldo = Double.valueOf(args[3]);

        System.out.println(
                "###############################################################################################");
        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        System.out.println(
                "-----------------------------------------------------------------------------------------------");
        System.out.println("Qual o seu nome completo? ");
        String nome = scanner.next();
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();
        System.out.println(
                "###############################################################################################");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + "], conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
