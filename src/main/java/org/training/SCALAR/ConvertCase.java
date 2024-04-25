package org.training.SCALAR;

public class ConvertCase {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)>=65 && A.charAt(i)<=90){
                sb.setCharAt(i,(char) (A.charAt(i)+32));
            }else {
                sb.setCharAt(i,(char) (A.charAt(i)-32));
            }
        }
        return sb.toString();
    }
}
