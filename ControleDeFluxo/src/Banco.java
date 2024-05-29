import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("O quê deseja realizar: 1.Depositar 2.Sacar 3.Consultar Saldo 4.Encerrar ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor para deposito: ");
                    double saldoDepositado = scanner.nextDouble();
                    saldo = saldoDepositado + saldo;
                    System.out.println("Saldo atual:" + (saldo));
                    break;
                case 2:
                    System.out.println("Qual o valor deseja sacar: ");
                    double sacar = scanner.nextDouble();
                    if (saldo >= sacar) {
                        saldo = saldo - sacar;
                        System.out.println("Saldo atual: " + (saldo));
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual:" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}