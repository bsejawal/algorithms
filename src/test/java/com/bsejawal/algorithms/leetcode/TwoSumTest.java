package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TwoSumTest {
    private Algorithms algorithms;

    @BeforeEach
    public void setUp() throws Exception
    {
        algorithms = new Algorithms();
    }

    @Test
    @DisplayName("Test with simple array ")
    public void testWithValidParameter(){
        assertArrayEquals(new int[]{0,1}, algorithms.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    @DisplayName("Test with Array size 3")
    public void testWithArraySize3(){
        assertArrayEquals(new int[]{1,2}, algorithms.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    @DisplayName("Test with Array size 2")
    public void testWithArraySize2(){
        assertArrayEquals(new int[]{0,1}, algorithms.twoSum(new int[]{3,3}, 6));
    }

    @Test
    @DisplayName("Test for invalid")
    public void testInvalid(){
        assertNotEquals(new int[]{0,1}, algorithms.twoSum(new int[]{3,2,1, 6}, 1));
    }


}
