package org.training.SCALAR;

public class BinaryAndBitWise {

    public static void main(String[] args) {
        System.out.println(((0|(1<<3) ) |(1<<5)) );
       // System.out.println(((0|(Math.pow(1,2)) ) |(1<<5)) );

        int A =4;
        int  B =4;

        double result = 0+ Math.pow(2, A)+Math.pow(2, B);
        System.out.println(Math.round(result));
    }
}
