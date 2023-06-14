package io.codelex.advance_exercise.first_exercise;

import java.math.BigDecimal;

public class MainProgram {
    public static void main(String[] args) throws NotEnoughFundsException {
        Card creditCard = new CreditCard(12345, "Bob Dilan", 045, new BigDecimal(10000));
        Card debitCard = new DebitCard(54321, "Samantha Rice", 054, new BigDecimal(110));
        System.out.println(creditCard.getBalance());
        creditCard.deposit(new BigDecimal(901));
        System.out.println(creditCard.getBalance());
        System.out.println("=====================");
        System.out.println(debitCard.getBalance());
        debitCard.withdraw(new BigDecimal(1000));
        System.out.println(debitCard.getBalance());
    }
}
