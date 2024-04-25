package org.training.SCALAR;

public class SimpleRecursion {

    static int bar(int x, int y) {
        System.out.println("bar called " + x + " " + y);
        if (y == 0) return 0;
        int m = bar(x, y - 1);
        int b = x + m;
        System.out.println( "b at this poitn " +b);
        return (b);
    }

    static int foo(int x, int y) {
        System.out.println("foo called");
        if (y == 0) {
            System.out.println("foo returns as 1");
            return 1;
        }

        int z =  foo(x, y - 1);
        System.out.println("foo calls Bar Z as " +z);
        int c = bar(x, z);
        System.out.println("c will be retruend as  " +c);
        return c;

    }
    static int foo1(int x, int y) {
        System.out.println("foo1 called");
        if (y == 0) return 1;

        int z =  foo1(x, y - 1);
        System.out.println("foo return statement");
    return z ;
    }


    public static void main(String[] args) {

        System.out.println(foo(3, 3));
    }
}
