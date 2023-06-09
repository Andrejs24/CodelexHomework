package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int dimension;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster() {

    }

    public Poster(int fee, int dimension, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimension = dimension;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(int costPerCopy) {
        this.costPerCopy = costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster :" +
                "dimension=" + dimension +
                ", numberOfCopies=" + numberOfCopies +
                ", costPerCopy=" + costPerCopy;
    }
}
