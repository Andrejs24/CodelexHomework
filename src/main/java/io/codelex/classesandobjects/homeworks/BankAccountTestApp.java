package io.codelex.classesandobjects.homeworks;

import io.codelex.classesandobjects.practice.BankAccount;

public class BankAccountTestApp {
    public static void main(String[] args) {
        BankAccount firstBankAccount = new BankAccount("Andrejs");
        BankAccount secondBankAccount = new BankAccount("Benson");

        firstBankAccount.setBalance(1500);
        firstBankAccount.deposit(200);
        secondBankAccount.setBalance(40);
        secondBankAccount.withdraw(50);
        System.out.println(firstBankAccount);
        System.out.println(secondBankAccount);
    }
}
