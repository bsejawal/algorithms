package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidParenthesesTest {

    private LeetcodeEasyAlgorithm algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new LeetcodeEasyAlgorithm();
    }

    @Test
    @DisplayName("Input: s =(), Output: true")
    public void testWithValidParentheses(){
        assertTrue(algorithms.isValidParentheses("()"));
    }

    @Test
    @DisplayName("Input: s =()[]{}, Output: true")
    public void testWithValidMultipleParentheses(){
        assertTrue(algorithms.isValidParentheses("()[]{}"));
    }

    @Test
    @DisplayName("Input: s =(], Output: false")
    public void testWithInvalidParentheses(){
        assertFalse(algorithms.isValidParentheses("(]"));
    }

    @Test
    @DisplayName("Input: s =([)], Output: false")
    public void testWithInvalidMultipleParentheses(){
        assertFalse(algorithms.isValidParentheses("([)]"));
    }

    @Test
    @DisplayName("Input: s ={[]}, Output: true")
    public void testWithValidInnerParentheses(){
        assertTrue(algorithms.isValidParentheses("{[]}"));
    }

    @Test
    @DisplayName("Input: s ={[]}, Output: true")
    public void testWithInValidInnerParentheses(){
        assertFalse(algorithms.isValidParentheses("]}{["));
    }

}
