package io.codelex.oop.persons;

public class Customer extends Person {

    private String customerId;
    private int purchaseCount;


    public Customer(String firstName, String lastName, String iD, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, iD, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public Customer(String firstName, String lastName, String iD, int age) {
        super(firstName, lastName, iD, age);
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " ID-" + customerId + " " + "(" + purchaseCount + " purchases)";
    }
}
