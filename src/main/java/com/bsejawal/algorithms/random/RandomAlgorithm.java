package com.bsejawal.algorithms.random;


public class RandomAlgorithm {
    public static void main(String[] args) {
//        String input="abc de ";
//        String output="edc ba ";
        String input=" a b c ";
        String output=" c b a ";
        System.out.println(new RandomAlgorithm().reverseStringPreserveSpace(input).equals(output));
    }

    public String reverseStringPreserveSpace(String s){
        char[] input = s.toCharArray();
        char[] result = new char[input.length];


        for(int i=0; i<input.length; i++)
            if(input[i] == ' ') result[i] = ' ';

        int j=input.length-1;
        for(int i=0; i<input.length; i++) {
            if (input[i] != ' ') {
                if (result[j]==' ') {
                    j--;
                }
                result[j] = input[i];
                j--;

            }
        }


        return String.valueOf(result);
    }

}
