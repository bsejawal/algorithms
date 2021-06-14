package com.bsejawal.algorithms.binary;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearchTest {
    private BinarySearch search;

    @BeforeEach
    public void setUp(){
        search = new BinarySearch();
    }

    @Test
    public void testBinarySearch(){
        Set<Integer> range = IntStream.rangeClosed(1, 100)
                .boxed().collect(Collectors.toSet());
        int[] sortedInteger =  range.stream().mapToInt(i -> i).toArray();
        assertTrue(51 == search.binarySearchWhileLoop(sortedInteger, 73));
    }
}
