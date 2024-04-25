package org.training.SCALAR;

public class Triplet {
    public static int singleNumber(final int[] A) {

        int num = 0;
        for (int i = 0; i < 32; i++) {

            int count = 0;
            for (int j = 0; j < A.length; j++) {

                if (checkBitSet(A[j], i)) {
                    count++;
                }
            }

            if (count % 3 == 1) {
                num = (num | (1 << i));
            }
        }

        return num;
    }

    public static boolean checkBitSet(int num, int position) {
        if ((num & (1 << position)) >0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(singleNumber( new int  []{1,1,1,2,2,2,3}));
    }

}
