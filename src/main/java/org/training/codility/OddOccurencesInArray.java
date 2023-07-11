package org.training.codility;

import java.util.*;

// this is a n2 solution
public class OddOccurencesInArray {
    public int solution1(int[] A) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < A.length ; i++) {
            if (lst.contains(A[i])){
                lst.remove(lst.indexOf(A[i]));
            }else {
                lst.add(A[i]);
            }
        }
        return lst.get(0);
    }
    public int solution2(int[] A) {
        Map<Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length ; i++) {
            if (occurrencesMap.containsKey(A[i])){
                occurrencesMap.put(A[i],occurrencesMap.get(A[i])+1);
            }else {
                occurrencesMap.put(A[i],1);
            }
        }
        Set<Integer> keySet = occurrencesMap.keySet();
        for (int currentKey : keySet){
            if(occurrencesMap.get(currentKey) % 2 !=0){
                return currentKey;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        OddOccurencesInArray obj = new OddOccurencesInArray();
        int [] oddArray= {7,7,9,9,3,1,5,5,1};
        System.out.println(obj.solution1(oddArray));
    }

}
