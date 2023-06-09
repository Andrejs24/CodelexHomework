package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addScale(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double hourlyPay = super.pay() + commissionRate;
        double commissionSales = totalSales * commissionRate;
        totalSales = 0;
        return hourlyPay + commissionSales;

    }

    @Override
    public String toString() {
        return super.toString() + " total sales = " + totalSales;
    }
}
