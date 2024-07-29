package com.bsejawal.algorithms.sort;

import com.bsejawal.algorithms.util.GenerateRandomNumber;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = GenerateRandomNumber.get(1, 2000, 500);
        System.out.println("before : " + Arrays.toString(nums));
        long startTime = System.currentTimeMillis();
        System.out.println(" after : " + Arrays.toString(sort(nums)));

//        long stopTime = System.currentTimeMillis();
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime);


    }

    private static int[] sort(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                count++;
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("count = " + count);

        return numbers;
    }
}
