package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PalindromeNumberTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setUp() throws Exception{
        algorithms = new Algorithms();
    }

    @Test
    @DisplayName("With Valid Parameter")
    public void testWithValidParameter(){
        assertTrue(algorithms.isPalindromeNumber(121));
    }


//    From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    @Test
    @DisplayName("With Negative Number")
    public void testWithNegativeNumber(){
        assertFalse(algorithms.isPalindromeNumber(-121), "From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.");
    }

    @Test
    @DisplayName("With Invalid Number")
    public void testWithInvalidNumber(){
        assertFalse(algorithms.isPalindromeNumber(10), "Reads 01 from right to left. Therefore it is not a palindrome");
    }

}
