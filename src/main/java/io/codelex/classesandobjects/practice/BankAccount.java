package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String name) {
        this.name = name;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return "" + name + ", -$" + String.format("%.2f", balance * -1);
        } else return "" + name + ", $" + String.format("%.2f", balance);
    }


}
