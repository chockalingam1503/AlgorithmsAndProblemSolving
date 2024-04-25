package org.training.SCALAR;

public class SumOFBiwiseOrOfAllSubArrays {

        public static int solve1(int[] A) {
            int n = A.length;
            int[] idx = new int[32];
            long ans = 0;
            for (int i = 1; i <= n; ++i) {
                long tmp = A[i - 1];
                for (int j = 0; j <= 31; ++j) {
                    long pw = 1 << j;
                    if ((tmp & pw) != 0) { //if jth bit is set
                        ans += pw * i; // add its contribution in ans for all subarrays ending at index i
                        idx[j] = i; // store the index for next elements
                    } else if (idx[j] != 0) // if jth bit is not set
                    {
                        ans += pw * idx[j]; // add its contribution in ans for all subarrays ending at index i using
                    } // the information of last element having jth bit set
                }
            }
            return (int)(ans % 1000000007);
        }

    public static  int solve(int[] A) {
        long M = 1000000007;

        int N = A.length;

        long totalSubarrays = (N*(N+1))/2;
        long totalORSum = 0; //sum of bitwise OR of all subarrays

        //step1: traverse through each bit of element of array
        for(int i = 0; i < 32; i++) {
            long subArrayUnsetBit = 0;
            long zeroCount = 0;
            for(int j = 0; j < N; j++) {
                //2.check if bit is unset(0).count the number of unset bits.
                //Calculate the number of sub arrays with unset ith bit position

                //for each element, check if bit at "position" is unset
                //if it's unset, add to the total
                //since we are looking for number of subarrays, if there are continuous unset bit position, the number of subarrays will depend on it as well.
                long pw = 1 << i;
                if ((A[j] & pw )<1) {
                    zeroCount++;
                }
                else {
                    subArrayUnsetBit = subArrayUnsetBit + (zeroCount * (zeroCount + 1)) / 2;
                    zeroCount = 0;//reset
                }

            }
            //get the number of subarrays which have ith bit as unset
            subArrayUnsetBit = subArrayUnsetBit + (zeroCount*(zeroCount+1))/2;
            //number of sub arrays which have ith bit set

//            subArrayUnsetBit=(zeroCount*(zeroCount+1))/2;
            long subArraySetBit = totalSubarrays - subArrayUnsetBit;
            //if ith bit is set, its value would be: 2^i == (1<<i)
            long powerValue = (1<<i);
            //contribution to total sum by all subarrays which has set bit at ith position
            long contribution = (subArraySetBit * powerValue);
            totalORSum = (totalORSum + contribution);

        }
        return (int)(totalORSum % M);

    }


    public static void main(String[] args) {
        System.out.println( solve(new int[]{1,2,3,4,5}));
    }

}
