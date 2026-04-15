import java.util.*;

import javax.naming.InsufficientResourcesException;
public class account {
    private String accountHolder;
    private double balance;
    private ArrayList<Double>transactions;
    private static double INITIAL_BALANCE = 1000;
    public account(String name, double initialBalance){
        this.accountHolder = name;
        this.balance = INITIAL_BALANCE;
        this.transactions = new ArrayList<>();
    }
    public void deposit(double amount) {
        if (amount < 0){
            throw new IllegalArgumentException("amount cannot be negative");
        }
        balance += amount;
        addTransaction(amount);
        System.out.println("deposited: "+ amount);

    }
    public void withdraw(double amount) throws insufficientfundsexception {
        if (amount < 0){
            throw new IllegalArgumentException("amount cannot be negative");
        }
        if (amount > balance) {
            throw new insufficientfundsexception("not enough balance");
        }
        balance -= amount;
        addTransaction(-amount);
        System.out.println("withdrawn: " + amount);

    }
    private void addTransaction(double amount){
        if(transactions.size() == 5) {
            transactions.remove(0);
        }
        transactions.add(amount);
    }
    public void printMiniStatement() {
        System.out.println("\nLast Transactions:");
        for (double t: transactions ) {
            System.out.println();
        }
        System.out.println("current balance: "+ balance);
    }
}
