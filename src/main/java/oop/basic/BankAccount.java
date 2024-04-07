package oop.basic;

public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance = 0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }
}
