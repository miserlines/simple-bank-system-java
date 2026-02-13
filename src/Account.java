public class Account {

    String owner;
    double balance;

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void showBalance() {
        System.out.println("Titular: " + owner);
        System.out.println("Saldo atual: " + balance);
    }
}
