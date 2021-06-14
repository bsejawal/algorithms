package com.bsejawal.algorithms.leetcode;

import com.bsejawal.algorithms.leetcode.node.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLinkedListsTest {
    private LeetcodeEasyAlgorithm algorithms;

    @BeforeEach
    public void setUp(){
        algorithms = new LeetcodeEasyAlgorithm();
    }
//    mergeTwoSortedLinkedLists

    @Test
    @DisplayName("Valid Parameter input: l1 = [1,2,4], l2 = [1,3,4], Output: [1,1,2,3,4,4]")
    public void testValidInput(){
        Node l1 = new Node(0);
        Node l1H = l1;
        l1H.next =  new Node(1);
        l1H = l1H.next;
        l1H.next = new Node(2);
        l1H = l1H.next;
        l1H.next = new Node(4);

        Node l2 = new Node(0);
        Node l2H = l2;
        l2H.next = new Node(1);
        l2H = l2H.next;
        l2H.next = new Node(3);
        l2H = l2H.next;
        l2H.next = new Node(4);

        Node result = algorithms.mergeTwoSortedLinkedLists(l1.next, l2.next);


        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }



}


