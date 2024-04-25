package org.training.SCALAR;

public class RecurisvePrint {

    public static  void solve(int A) {
        if(A==1){
            System.out.println(1 +" ");
            return;
        }
        solve(A-1);
        System.out.println(A + " ");
    }

    public static void main(String[] args) {
        solve(4);
    }
}
