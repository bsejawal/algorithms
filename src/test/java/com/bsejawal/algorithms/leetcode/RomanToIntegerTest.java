package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanToIntegerTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new Algorithms();
    }



    @Test
    @DisplayName("Validate III Three same character")
    public void TestFor_III(){
        assertEquals(3, algorithms.romanToInt("III"));
    }


    @Test
    @DisplayName("Validate IV (subtraction)")
    public void testToValidate_IV(){
        assertEquals(4, algorithms.romanToInt("IV"));
    }

    @Test
    @DisplayName("Validate IX (subtraction)")
    public void testToValidate_IX(){
        assertEquals(9, algorithms.romanToInt("IX"));
    }

    @Test
    @DisplayName("LVIII, output is 58 (L = 50, V= 5, III = 3)")
    public void testToValidate_LVIII(){
        assertEquals(58, algorithms.romanToInt("LVIII"));
    }


    @Test
    @DisplayName("MCMXCIV, output is 1994 M = 1000, CM = 900, XC = 90 and IV = 4")
    public void testToValidate_MCMXCIV(){
        assertEquals(1994, algorithms.romanToInt("MCMXCIV"));
    }



}
