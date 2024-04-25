package org.training.SCALAR;

public class SlidginWindow {

    public static int solve(int[] A, int B, int C) {


        long sum =0;
        for(int i=0;i<B;i++){
            sum +=A[i];
        }

        if((sum/B)<C){
            return 1;
        }

        for(int i =1;B+i<=A.length;i++){
            sum = sum-A[i-1]+A[i+B-1];
            if((sum/B)<=C){
                return 1;
            }
        }

        return 0;

    }


    public static void main(String[] args) {
        System.out.println( solve (new int  [] {91,32,47,23,47,35,31,3,1,2,30,2,3,48,30,33,42,34,4,24,15,43,24,10,17,44,41,10,33,37,50,12,41,5,10,37,5,5,1,18,37,6,30,14,6,34,2,13,32,37,11,20,49,44,27,20,46,14,25,5,41,11,12,21,3,37,11,24,50,26,32,1,33,45,17,8,22,24,25,36,39,10,33,46,24,22,6,44,36,32,23,0} , 65, 38));

        String s ="91 32 47 23 47 35 31 3 1 2 30 2 3 48 30 33 42 34 4 24 15 43 24 10 17 44 41 10 33 37 50 12 41 5 10 37 5 5 1 18 37 6 30 14 6 34 2 13 32 37 11 20 49 44 27 20 46 14 25 5 41 11 12 21 3 37 11 24 50 26 32 1 33 45 17 8 22 24 25 36 39 10 33 46 24 22 6 44 36 32 23 0 ";
        String[] s1 = s.split(" ");

        for (String s2 : s1) {
            System.out.print(s2+",");
        }
    }
}
