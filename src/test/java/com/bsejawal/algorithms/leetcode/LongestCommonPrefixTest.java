package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LongestCommonPrefixTest {

    private LeetcodeEasyAlgorithm algorithm;

    @BeforeEach
    public void setUp(){
        algorithm = new LeetcodeEasyAlgorithm();
    }

    @Test
    @DisplayName("Valid Parameter Test, input : [\"flower\",\"flow\",\"flight\"], output fl ")
    public void testSimpleValidParameter(){
        assertEquals("fl", algorithm.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    @DisplayName("Valid Parameter Test, input : [\"dog\",\"racecar\",\"car\"], output is empty String ")
    public void testForEmptyOutput(){
        assertEquals("", algorithm.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
