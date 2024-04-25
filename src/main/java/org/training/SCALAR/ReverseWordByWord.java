package org.training.SCALAR;

public class ReverseWordByWord {
    public String solve(String A) {
        String  [] wordArr= A.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<wordArr.length;i++){
            sb.append(reverse (wordArr[i]));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public String solveOnlyReverseWords(String A) {

        String  [] wordArr= A.split("\\s+");
        StringBuilder sb = new StringBuilder();

        int i=0;
        int j = wordArr.length-1;

        while (i<=j){
          String temp =wordArr[i];
          wordArr[i]=wordArr[j];
          wordArr[j]=temp;
            i++;
            j--;
        }

        for(String word  : wordArr){
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public String solveOptimized(String A) {
        A =reverse(A).trim();
        StringBuilder sb = new StringBuilder();
        String str="";
        boolean lastCharSpace=false;
        for (int i = A.length()-1; i >=0 ; i--) {
            if(A.charAt(i)!= ' '){
                str=A.charAt(i)+str;
                lastCharSpace=false;
            }else if(!lastCharSpace) {
                sb.append(str).append(" ");
                str="";
                lastCharSpace=true;
            }
            if(i==0){
                sb.append(str);
            }
        }

        return sb.toString().trim();
    }

    public  String reverse(String A) {
        StringBuilder sb = new StringBuilder(A);
        int i=0;
        int j = A.length()-1;

        while (i<=j){
            swap(sb,i,j);
            i++;
            j--;
        }
        return sb.toString();
    }

    public  void swap(StringBuilder sb , int start, int end){
        char temp =sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,temp);
    }

    public static void main(String[] args) {
        ReverseWordByWord obj = new ReverseWordByWord();
        System.out.println(obj.solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv"));
        System.out.println(obj.solveOptimized("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv"));
    }
}
