package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


//https://leetcode.com/problems/remove-element/
public class RemoveElementTest {

    private LeetcodeEasyAlgorithm algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new LeetcodeEasyAlgorithm();
    }

    @Test
    @DisplayName("valid input")
    public void validInputTest(){

//        public int removeElement(int[] nums, int val) {
        int input[] = {1,2,3,4,5};

        assertEquals(4, algorithms.removeElement(input, 2));

        }
}
