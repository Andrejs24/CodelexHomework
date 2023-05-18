package io.codelex.classesandobjects.homeworks;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingAccountTestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        System.out.print("How much money is in your account?: ");
        BigDecimal startingBalance = scanner.nextBigDecimal();
        System.out.print("Enter the annual interest rate: ");
        BigDecimal rate = scanner.nextBigDecimal();
        System.out.print("How long has the account been opened? ");
        int months = scanner.nextInt();


        SavingAccount savingsAccount = new SavingAccount(startingBalance);
        savingsAccount.rate = rate;

        BigDecimal totalDeposits = new BigDecimal(0);
        BigDecimal totalWithdrawals = new BigDecimal(0);

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            BigDecimal depositAmount = scanner.nextBigDecimal();
            savingsAccount.deposit(depositAmount);
            totalDeposits = totalDeposits.add(depositAmount);

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            BigDecimal withdrawalAmount = scanner.nextBigDecimal();
            savingsAccount.withdraw(withdrawalAmount);
            totalWithdrawals = totalWithdrawals.add(withdrawalAmount);

            savingsAccount.addingMonthlyInterest();
        }
        BigDecimal totalInterestEarned = (((savingsAccount.getBalance().subtract(startingBalance)).subtract(totalDeposits)).add(totalWithdrawals));

        System.out.println("Total deposited: $" + totalDeposits);
        System.out.println("Total withdrawn: $" + totalWithdrawals);
        System.out.println("Interest earned: $" + decimalFormat.format(totalInterestEarned));
        System.out.println("Ending balance: $" + decimalFormat.format(savingsAccount.getBalance()));
    }
}
