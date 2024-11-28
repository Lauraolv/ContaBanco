
import java.util.Scanner;

public class ContaTerminal {



    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome_cliente;
        double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome: ");
        nome_cliente = sc.next();
        System.out.println("Por favor, digite o nome da agência: ");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da agência: ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = sc.nextDouble();


        Conta conta = new Conta(numero, agencia, nome_cliente, saldo);
        System.out.println(conta.getConta());
        sc.close();
    }
}