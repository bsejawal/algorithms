package com.bsejawal.algorithms.util;

import java.util.*;
import java.util.random.RandomGenerator;
import static org.junit.jupiter.api.Assertions.*;


public class GenerateRandomNumber {
    public static void main(String[] args) {
//        testGetMethod();
        System.out.println(Arrays.toString(get(10, 90, 0)));
    }

    static  void  testGetMethod(){
        int start = 10;
        int end = 20;
        int count = 5;

        int[] randomNumbers = get(start, end, count);

        // Verify the length of the array is equal to the count
        assertEquals(count, randomNumbers.length, "Array length should be equal to count");

        // Verify all numbers are within the specified range
        for (int num : randomNumbers) {
            assertTrue(num >= start && num <= end, "Number should be within the specified range");
        }

        // Verify all numbers are unique
        Set<Integer> numberSet = new HashSet<>();
        for (int num : randomNumbers) {
            assertTrue(numberSet.add(num), "Number should be unique in the array");
        }
    }

    public static int[] get(int start, int end, int count){
        if(count <= 0)
            throw new IllegalArgumentException("Count must be positive number");

        if(end <= start)
            throw new IllegalArgumentException("End must be greater then start");

        int rangeSize = end - start +1;
        if(count > rangeSize)
            throw new IllegalArgumentException("Count must not be greater then the range size (end-start)");

        RandomGenerator random = RandomGenerator.getDefault();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(count > uniqueNumbers.size()){
            int randomNumber = random.nextInt(start, end+1);
            uniqueNumbers.add(randomNumber);
        }

        List<Integer> list = new ArrayList<>(uniqueNumbers);
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
