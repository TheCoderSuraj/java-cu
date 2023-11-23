import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double bal) {
        balance = bal;
    }

    synchronized void printBalance() {
        System.out.println("The current balance is: " + balance);
    }

    synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Amount deposited.");
    }

    synchronized void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not Enough balance.");
            return;
        }
        balance -= amount;
        System.out.println(amount + " Amount withdrawal.");
    }

}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount acc) {
        account = acc;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            double amt = Math.random() * 1000;
            account.deposit(amt);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount acc) {
        account = acc;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            double amt = Math.random() * 1000;
            account.withdraw(amt);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        account.printBalance();
    }
}

public class ev3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(4000);

        Thread depositThread = new DepositThread(acc);
        Thread withdrawThread = new WithdrawThread(acc);
        depositThread.start();
        withdrawThread.start();

    }
}
