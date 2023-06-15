package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;


    public void deposit(double amount) {

        balance += amount;
    }

    public void withdrawal(double amount) {

        balance -= amount;
    }

    public double balance() {

        return balance;
    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    @Override
    public String toString() {

        return owner + " balance: " + balance;
    }
}
