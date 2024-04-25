package org.training.SCALAR;

public class PairSum {

    public int solve(int[] A, int B) {

        int count =0;
        for (int i = 0; i < A.length; i++) {

            for (int j = i +1; j < A.length;  j++) {
                if(A[i]+A[j]==B){
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        PairSum pObj = new PairSum();
        System.out.println(pObj.solve(new int  []{1,2,3,2,1}, 5));
        System.out.println("--");
int A= -1;
int B = 1;
int C=20;
        double val =((Math.pow(A,B)) % C );


//        if(val==0){
//            System.out.println("val 0");
//
//
//            System.out.println( 0);
//        }
////        if(val<C){
////            return (int) (C-val);
////        }

        System.out.println( (int)(val));



    }
}
