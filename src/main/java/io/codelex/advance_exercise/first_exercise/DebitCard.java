package io.codelex.advance_exercise.first_exercise;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(int number, String fullName, int CCV, BigDecimal balance) {
        super(number, fullName, CCV, balance);
    }

    public void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal balance = super.getBalance();
        if (balance.add(amount).compareTo(BigDecimal.valueOf(10000)) > 0) {
            throw new NotEnoughFundsException("Warning: To much money");
        }
        super.setBalance(balance.add(amount));
    }

    @Override
    public void deposit(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal balance = super.getBalance();

        super.setBalance(balance.subtract(amount));
    }
}
