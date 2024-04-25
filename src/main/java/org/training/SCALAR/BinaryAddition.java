package org.training.SCALAR;

public class BinaryAddition {

    public String addBinary(String A, String B) {
        if (A.length() > B.length()) {
            B = addLeadingZeros(B, A.length() - B.length());
        } else {
            A = addLeadingZeros(A, B.length() - A.length());
        }
        String carry = "0";
        String finalVal = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            String total = carry + A.charAt(i) + B.charAt(i);
            String binarySum = findBinarySum(total);
            if (i == 0) {
                finalVal = binarySum + finalVal;
            } else {
                carry = String.valueOf(binarySum.charAt(0));
                finalVal = binarySum.charAt(1) + finalVal;
            }
        }

        if (finalVal.startsWith("0")) {
            return finalVal.substring(1);
        }
        return finalVal;
    }

    public String addBinaryOptimized(String A, String B) {

        String finalVal = "";
        int i = A.length() - 1;
        int j = B.length() - 1;

        int carryFrwd = 0;
        int currentDigit;
        while (i >= 0 || j >= 0) {
            int digitA;
            int digitB;
            if (i >= 0) {
                digitA = A.charAt(i) == '1' ? 1 : 0;
            } else digitA = 0;
            if (j >= 0) {
                digitB = B.charAt(j) == '1' ? 1 : 0;
            } else digitB = 0;
            int sum = carryFrwd + digitA + digitB;
            carryFrwd = sum / 2;
            currentDigit = sum % 2;
            finalVal = currentDigit + finalVal;
            i--;
            j--;
        }

        if (carryFrwd == 1) {
            finalVal = carryFrwd + finalVal;
        }

        if (finalVal.startsWith("0")) {
            return finalVal.substring(1);
        }

        return finalVal;
    }


    public String findBinarySum(String charSet) {
        int countOf1 = 0;
        for (int i = 0; i < charSet.length(); i++) {
            String val = String.valueOf(charSet.charAt(i));
            if (val.equals("1")) {
                countOf1++;
            }
        }

        if (countOf1 == 3) {
            return "11";
        }
        if (countOf1 == 2) {
            return "10";
        }
        if (countOf1 == 1) {
            return "01";
        }
        if (countOf1 == 0) {
            return "00";
        }
        return "00";
    }

    public String addLeadingZeros(String num, int requiredLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < requiredLength; i++) {
            sb.append("0");
        }
        sb.append(num);
        return sb.toString();
    }

    public static void main(String[] args) {
        BinaryAddition b = new BinaryAddition();
        System.out.println(b.addBinary("1010110111001101101000", "1010110111001101101000"));
        System.out.println(b.addBinaryOptimized("1010110111001101101000", "1010110111001101101000"));
    }
}
