package org.training.SCALAR;

public class StringOperations {

    public static  String solve(String A) {
        A = A + A;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            if (!(A.charAt(i) >= 65 && A.charAt(i) <= 90)) {
                sb.append(A.charAt(i));
            }
        }


        A = sb.toString();

        for (int i = 0; i < A.length(); i++) {


            switch (A.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                  A=  A.replace(A.charAt(i), '#');
                    break;
                default:

            }
        }

        return A;
    }

    public static void main(String[] args) {
        System.out.println(solve("hgUe"));
    }
}