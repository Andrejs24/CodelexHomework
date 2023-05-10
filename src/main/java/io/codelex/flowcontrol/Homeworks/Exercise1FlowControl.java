package io.codelex.flowcontrol.Homeworks;

public class Exercise1FlowControl {

    public void largestNumber(int a, int b, int c){
        int largest = a;
        if(b>largest) {
            largest = b;
        }
        if (c>largest){
            largest=c;
        }
        System.out.println(largest);
    }
}
