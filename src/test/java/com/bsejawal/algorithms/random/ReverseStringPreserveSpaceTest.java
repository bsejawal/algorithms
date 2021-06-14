package com.bsejawal.algorithms.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseStringPreserveSpaceTest {

    private RandomAlgorithm algorithm;

    @BeforeEach
    public void setUp(){
        algorithm = new RandomAlgorithm();
    }
    @Test
    public void testValidParameter(){
        String input  ="I Am Not String";
        String output = "g ni rtS toNmAI";
        assertEquals(output, algorithm.reverseStringPreserveSpace(input));



//        Input  : "abc de"
//        Output : edc ba
//
//        Input : "intern at geeks"
//        Output : skeegt an retni
//
//        Input : "Help others"
//        Output : sreh topleH
//        assertEquals("fl", algorithm.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

}
