package io.codelex.classesandobjects.homeworks;

import java.math.BigDecimal;

public class SavingAccount {

    public BigDecimal rate;
    private BigDecimal balance;


    public BigDecimal addingMonthlyInterest() {
        BigDecimal monthlyInterest = rate.divide(new BigDecimal(12));
        BigDecimal interest = balance.multiply(monthlyInterest);
        return balance = balance.add(interest);
    }

    public BigDecimal getBalance() {
        return balance;
    }


    public BigDecimal deposit(
            BigDecimal startingBalance) {
        return balance = balance.add(startingBalance);
    }

    public BigDecimal withdraw(BigDecimal amount) {
        return balance = balance.subtract(amount);
    }


    public SavingAccount(BigDecimal balance) {
        this.balance = balance;
    }
}
