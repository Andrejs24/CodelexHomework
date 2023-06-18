package io.codelex.advance_exercise.first_exercise;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int number, String fullName, int CCV, BigDecimal balance) {
        super(number, fullName, CCV, balance);
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal balance = super.getBalance();
        if (balance.add(amount).compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
        super.setBalance(balance.add(amount));
    }

    @Override
    public void deposit(BigDecimal amount) throws NotEnoughFundsException {
        if (getBalance().compareTo(amount) == -1) {
            throw new NotEnoughFundsException("It's not possible!");

        } else if (getBalance().subtract(amount).compareTo(new BigDecimal(100)) == -1) {
            System.out.println("Warning: Low funds");
        }
        setBalance(getBalance().subtract(amount));
    }
}
