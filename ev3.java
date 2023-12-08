import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double bal) {
        balance = bal;
    }

    synchronized void printBalance() {
        System.out.println("The current balance is: " + balance);
    }

    synchronized void deposit() {
        for (int i = 0; i < 10; i++) {
            double amt = Math.random() * 1000;
            balance += amt;
            System.out.println(amt + " Amount deposited.");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    synchronized void withdraw() {

        for (int i = 0; i < 10; i++) {
            double amt = Math.random() * 1000;
            if (balance < amt) {
                System.out.println("Not Enough balance.");
                return;
            }
            balance -= amt;
            System.out.println(amt + " Amount withdrawal.");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount acc) {
        account = acc;
    }

    public void run() {
        account.deposit();

    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount acc) {
        account = acc;
    }

    public void run() {
        account.withdraw();
        // account.printBalance();
    }
}

public class ev3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(4000);

        Thread depositThread = new DepositThread(acc);
        Thread withdrawThread = new WithdrawThread(acc);
        depositThread.start();
        withdrawThread.start();
        try {
            depositThread.join();
            withdrawThread.join();
            acc.printBalance();
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}
