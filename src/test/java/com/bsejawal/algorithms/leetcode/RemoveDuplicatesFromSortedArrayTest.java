package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArrayTest {
    private LeetcodeEasyAlgorithm algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new LeetcodeEasyAlgorithm();
    }

    @Test
    @DisplayName("")
    public void validInput(){

//        Input: nums = [1,1,2]
//        Output: 2, nums = [1,2]

        int input[] = new int[]{1,1,2};
        int output = algorithms.removeDuplicatesFromSortedArray(input);
        System.out.println("input  = " + Arrays.toString(input) + ", output  = " + output  );

    }

    @Test
    @DisplayName("")
    public void validInput2(){
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4]

        int input[] = new int[]{0,0,1,1,1,2,2,3,3,4};
        int output = algorithms.removeDuplicatesFromSortedArray(input);
        System.out.println("input  = " + Arrays.toString(input) + ", output  = " + output  );

    }

    @Test
    @DisplayName("")
    public void validInput3(){
        int input[] = new int[]{0,1,2,3,4,4};
        int output = algorithms.removeDuplicatesFromSortedArray(input);
        System.out.println("input  = " + Arrays.toString(input) + ", output  = " + output  );
    }
}
