package com.bsejawal.algorithms;

import java.util.Random;

public class NumUtils {
    public static int generateRandomNumber(int min, int max){
        Random randomNum = new Random();
        int result = min + randomNum.nextInt(max);
        return result;
    }

    public static int generateRandomNumber(){
        return new Random().nextInt();
    }
    public static int[] generateRandomNumbers(int n){
        int[] numArray = new int[n];
        for(int i=0; i<n; i++){
            numArray[i] = generateRandomNumber();
        }
        return numArray;
    }
    public static int[] generateRandomNumbers(int n, int start, int end){
        int[] numArray = new int[n];
        for(int i=0; i<n; i++){
            numArray[i] = generateRandomNumber(start, end);
        }
        return numArray;
    }

}
