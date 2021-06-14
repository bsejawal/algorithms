package com.bsejawal.algorithms.random;


public class RandomAlgorithm {

    public String reverseStringPreserveSpace(String s){
        char[] input = s.toCharArray();
        char[] result = new char[input.length];
        int j=0;
        for(int i=input.length-1; i>=0; i--){
            if(input[j] == ' ') {
                result[j++] = ' ';
                i++;
                continue;
            }
            if(input[i] == ' ')
                continue;

         result[j++] = input[i];
        }
        return String.valueOf(result);
    }
}
