package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        boolean result = true;

        if (xLength + yLength + zLength < 300) {
            result = true;
        } else {
            result = false;
            throw new IllegalArgumentException("Sum of dimension is bigger than 300...");
        }
        if (xLength >= 30 && yLength >= 30 && zLength >= 30) {
            result = true;
        } else {
            result = false;
            throw new IllegalArgumentException("Some of length are bigger than 30...");
        }

        if (!isExpress) {
            if (weight < 30) {
                result = true;
            } else {
                result = false;
                throw new IllegalArgumentException("weight is bigger than 30");
            }
        }
        if (isExpress) {
            if (weight < 15) {
                result = true;
            } else {

                throw new IllegalArgumentException("weight is bigger than 15");
            }
        }

        return result;
    }

}


