package org.training.SCALAR;

public class FinonnaciItertaion {

    public static int finFib(int n){
        int n1=0;
        int n2 =1;
        int i =2;
        while(i<n){
            int temp =n1;
            n1=n2;
            n2 =temp+n2;
            i++;
        }
        return n1+n2;
    }


    public static int findAthFib(int num) {

        if (num == 1) {
            return 1;
        }

        if (num == 0) {
            return 0;
        }
       return  findAthFib(num-1)+findAthFib(num-2);

    }

    public static void main(String[] args) {
        System.out.println(finFib(9));
        System.out.println(findAthFib(9));
    }
}
