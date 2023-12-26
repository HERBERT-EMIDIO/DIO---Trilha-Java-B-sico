import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Qual o seu nome?");
        String nome = sc.nextLine().toLowerCase();
        System.out.println();

        System.out.println("Por favor, digite o número da Agência!");
        int numeroConta = sc.nextInt();
        System.out.println();
        
        System.out.println("Agora digite o código de Agência! (EX: 0123-0)");
        String codAgencia = sc.nextLine();
        sc.next();

        System.out.println();
        System.out.println("Deseja realizar algum deposito? (s/n)");
        char opcao = sc.next().charAt(0);

        
        ContaTerminal contaCliente = new ContaTerminal(numeroConta,codAgencia,nome);
        contaCliente.Menu(opcao);
        System.out.println("=======================================");

        contaCliente.CriarConta();
    }
}
