import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String name = scanner.nextLine();

        Account account = new Account(name);

        int option = 0;

        while (option != 4) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Valor para depósito: ");
                double value = scanner.nextDouble();
                account.deposit(value);

            } else if (option == 2) {
                System.out.print("Valor para saque: ");
                double value = scanner.nextDouble();
                account.withdraw(value);

            } else if (option == 3) {
                account.showBalance();

            } else if (option == 4) {
                System.out.println("Programa finalizado");

            } else {
                System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
