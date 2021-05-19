package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ReverseIntegerTest {
    private Algorithms algorithms;

    @BeforeEach
    public void setUp() throws Exception
    {
        algorithms = new Algorithms();
    }

    @Test
    @DisplayName("Simple number should work")
    public void simpleNumber() {
        assertEquals(12345, algorithms.reverseInteger(54321), "Simple number should work");
    }

    @Test
    @DisplayName("Test With Zero ")
    public void testWithZero(){
        assertEquals(0, algorithms.reverseInteger(0));
    }

    @Test
    @DisplayName("Test with negative Number")
    public void testWithNegativeNumber(){
        assertEquals(-2123, algorithms.reverseInteger(-3212));
    }


    //    The reverse of 1534236469 is 9646324351, which is larger than Integer.MAX_VALUE, so the code will result in numeric overflow and so it returns 0 instead of incorrect result.
    @Test
    @DisplayName("Test with greater than Integer.MAX_VALUE")
    public void testWithIntegerMaxValue(){
        assertEquals(0, algorithms.reverseInteger(1534236469));
    }

}
