package io.codelex.oop.parcels;

public class ParcelTestApp {

    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(15, 20, 29, 7f, true);
        Parcel parcel2 = new Parcel(56, 67, 36, 14.5f, false);
        Parcel parcel3 = new Parcel(105, 204, 66, 40.5f, true);
        Parcel parcel4 = new Parcel(66, 66, 66, 40.5f, false);
        Parcel parcel5 = new Parcel(50, 50, 50, 11f, true);


        System.out.println("Expected  false :");
        System.out.println(parcel1.validate());
        System.out.println("Expected  true :");
        System.out.println(parcel2.validate());
        System.out.println("Expected  false :");
        System.out.println(parcel3.validate());
        System.out.println("Expected  false :");
        System.out.println(parcel4.validate());
        System.out.println("Expected  true :");
        System.out.println(parcel5.validate());

    }


}
