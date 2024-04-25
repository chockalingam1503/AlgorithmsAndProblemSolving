package org.training.SCALAR;

public class CountOfMax1s {

    public static int solve(String A) {
        int[] num = new int[A.length()];

        int countOf1s = 0;
        for (int i = 0; i < A.length(); i++) {
            boolean is1 = false;
            if (A.charAt(i) == '1') {
                is1 = true;
                countOf1s++;
            }
            num[i] = (is1) ? 1 : 0;
        }

        if (countOf1s == A.length()) {
            return -1;
        }
        int max1sCount = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] == 0) {

                int left = 0;
                int right = 0;
                int j = i - 1;
                while (j >= 0) {

                    if (num[j] == 1) {
                        left++;
                        j--;
                    } else {
                        break;
                    }
                }
                j = i + 1;
                while (j <= num.length - 1) {
                    if (num[j] == 1) {
                        right++;
                        j++;
                    } else {
                        break;
                    }
                }

                int currentCountOf1 = left + right + 1;
                if (currentCountOf1 > max1sCount) {
                    max1sCount = currentCountOf1;
                }
            }

        }

        return max1sCount;
    }

    public static int solveBySwapping1And0(String A) {
        int[] num = new int[A.length()];

        int countOf1s = 0;
        for (int i = 0; i < A.length(); i++) {
            boolean is1 = false;
            if (A.charAt(i) == '1') {
                is1 = true;
                countOf1s++;
            }
            num[i] = (is1) ? 1 : 0;
        }

        if (countOf1s == A.length()) {
            return countOf1s;
        }
        int max1sCount = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] == 0) {

                int left = 0;
                int right = 0;
                int j = i - 1;
                while (j >= 0) {

                    if (num[j] == 1) {
                        left++;
                        j--;
                    } else {
                        break;
                    }
                }
                j = i + 1;
                while (j <= num.length - 1) {
                    if (num[j] == 1) {
                        right++;
                        j++;
                    } else {
                        break;
                    }
                }
                int currentCountOf1=0;
                if(countOf1s==(left+right)){
                    currentCountOf1=left+right+1-1;
                } else {
                    currentCountOf1=left+right+1;
                }

                if (currentCountOf1 > max1sCount) {
                    max1sCount = currentCountOf1;
                }
            }

        }

        return max1sCount;
    }
    public static void main(String[] args) {
        System.out.println(solve("111111111"));
    }

}
