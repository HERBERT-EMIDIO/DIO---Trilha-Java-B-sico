import java.util.Scanner;

public class ContaTerminal {

    private int conta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(int conta, String agencia, String nomeCliente) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 500.00;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public void CriarConta() {

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                getNomeCliente(), getAgencia(), getConta(), getSaldo());
    }

    public double Depoisto(double valueDeposito) {

        setSaldo(this.saldo + valueDeposito);
        System.out.printf("Valor %.2f%n Depositado", valueDeposito);

        return getSaldo();

    }

    public void MostrarSaldo() {
        System.out.println("=====================================");
        System.out.printf("Seu saldo é %.2f%n", getSaldo());
    }

    public void Menu(char opcao) {
        Scanner sc = new Scanner(System.in);

        switch (opcao) {
            case 's':

                System.out.println("==== OK!! Sistema de Deposito... ======");
                System.out.println("Qual o valor para o deposito:\nR$");
                double valorDeposito = sc.nextDouble();
                Depoisto(valorDeposito);
                System.out.println("Deposito realizado!");
                MostrarSaldo();

                break;
            case 'n':

                System.out.println("Obrigado Volte Sempre!!");
                break;

            default:
                System.out.println("Opção inválida. Por favor, digite 's' para Sim ou 'n' para Não.");
                opcao = sc.next().charAt(0);
                Menu(opcao);
                break;
        }

    }

}
