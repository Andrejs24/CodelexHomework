package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Account.transfer;

public class AccountTestApp {
    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);


        Account myAccount = new Account("My account", 100.0);
        myAccount.deposit(20.0);
        System.out.println(myAccount);


        Account mattAccount = new Account("Matt's account", 1000);
        Account mySecondAccount = new Account("My account", 0);
        mattAccount.withdrawal(100);
        mySecondAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(mySecondAccount);


        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);

        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
