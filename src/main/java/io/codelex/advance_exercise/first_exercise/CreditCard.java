package io.codelex.advance_exercise.first_exercise;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(int number, String fullName, int CCV, BigDecimal balance) {
        super(number, fullName, CCV, balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        BigDecimal balance = super.getBalance();
        super.setBalance(balance.add(amount));
    }


    @Override
    public void deposit(BigDecimal amount) throws NotEnoughFundsException {
        BigDecimal balance = super.getBalance();
        if (balance.compareTo(amount) == -1) {
            throw new NotEnoughFundsException("It's not possible!");

        } else if (balance.subtract(amount).compareTo(new BigDecimal(100)) == -1) {
            System.out.println("Warning: Low funds");
        }
        setBalance(balance.subtract(amount));
    }
}

//    @Override
//    public void deposit(BigDecimal amount) throws NotEnoughFundsException {
//        BigDecimal balance = super.getBalance();
//        if (balance.subtract(amount).compareTo(BigDecimal.valueOf(100)) < 0) {
//            throw new NotEnoughFundsException("Warning: Low funds");
//        }
//        super.setBalance(balance.subtract(amount));
//    }



