package com.bsejawal.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LongestCommonPrefixTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new Algorithms();
    }

    @Test
    @DisplayName("Valid Parameter Test, input : [\"flower\",\"flow\",\"flight\"], output fl ")
    public void testSimpleValidParameter(){
        assertEquals("fl", algorithms.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    @DisplayName("Valid Parameter Test, input : [\"dog\",\"racecar\",\"car\"], output is empty String ")
    public void testForEmptyOutput(){
        assertEquals("", algorithms.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
