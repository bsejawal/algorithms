package com.bsejawal.algorithms.sort;

import com.bsejawal.algorithms.util.GenerateRandomNumber;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] nums = GenerateRandomNumber.get(1, 10000000, 1000);
        System.out.println("before : "+ Arrays.toString(nums));
        long startTime = System.currentTimeMillis();
        System.out.println(" after : "+ Arrays.toString(sort(nums)));
        sort(nums);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);


    }
    private static int[] sort(int[] nums){

        int [] numbers = nums;

        for(int i = 1; i<numbers.length; i++){
            for(int j=i-1; j>=0; j--){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }else{
                    break;
                }
            }
        }
        return numbers;
    }
}
