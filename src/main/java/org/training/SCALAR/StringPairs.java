package org.training.SCALAR;



public class StringPairs {

    static void findPairs(String s){
        char[] charArr = s.toCharArray();
        int count=0;
        for (int i = 0; i < charArr.length ; i++) {
            if(charArr[i]=='a'){
                for (int j = i; j < charArr.length ; j++){
                    if(charArr[j]=='g'){
                        count ++;
                    }
                }


            }

        }
        System.out.println(count);
    }

    static void findPairsOptimizedSolution(String s){
        char[] charArr = s.toCharArray();
        int countA=0;
        long pairCount=0;
        long M = 1000000007;
        for (int i = 0; i < charArr.length ; i++) {
            if(charArr[i]=='a'){
                countA++;
            }else  if(charArr[i]=='g'){
                pairCount+=countA;
            }
        }
        System.out.println(pairCount %M);
    }

    public static int solve(String A) {

        char[] charArr = A.toCharArray();
        int countA=0;
        long pairCount=0;
        long M = 1000000007;
        for (int i = 0; i < charArr.length ; i++) {
            if(charArr[i]=='A'){
                countA++;
            }else  if(charArr[i]=='G'){
                pairCount+=countA;
            }
        }
        return (int) (pairCount%M);
    }

    public static void main(String[] args) {
        findPairsOptimizedSolution("GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ");

        System.out.println(solve("GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ"));
    }
}
