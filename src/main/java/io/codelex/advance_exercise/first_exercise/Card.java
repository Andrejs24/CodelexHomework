package io.codelex.advance_exercise.first_exercise;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Card {
    private int number;
    private String fullName;
    private int CCV;
    private BigDecimal balance;

    public Card(int number, String fullName, int CCV, BigDecimal balance) {
        this.number = number;
        this.fullName = fullName;
        this.CCV = CCV;
        this.balance = balance;
    }


    public abstract void deposit(BigDecimal amount);

    public void withdraw(BigDecimal amount) throws NotEnoughFundsException {
        if (balance.compareTo(amount) == -1) {
            throw new NotEnoughFundsException("It's not possible!");

        }
        balance.subtract(amount);
    }


    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCCV() {
        return CCV;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return number == card.number && CCV == card.CCV && Objects.equals(fullName, card.fullName) && Objects.equals(balance, card.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, fullName, CCV, balance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", CCV=" + CCV +
                ", balance=" + balance +
                '}';
    }
}
