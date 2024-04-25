package org.training.SCALAR;

public class SuperSteamEnginerers {

        public int solve(int[] A, int B, int C) {
            int count =0;

            int pS[]=new int [A.length];

            for(int i =0; i<A.length;i++){
                if(i==0){
                    pS[i]=A[i];
                }else {
                    pS[i] =pS[i-1]+A[i];
                }
            }


            for(int i=0;(i+B)<A.length;i++){
                int right=B-1;
                if(i==0){
                    int sum  = pS[right];
                    if((sum/B)<C){
                        return 1;
                    }
                } else {
                    int sum  = pS[i+right]-pS[i-1];
                    if((sum/B)<C){
                        return 1;
                    }
                }

            }

            return 0;

        }
    }


