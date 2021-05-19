package com.bsejawal.algorithms.leetcode;

public class Algorithms {
    /**
     * https://leetcode.com/problems/reverse-integer/
     * @param n
     * @return reversed integer
     */
    public  int reverseInteger(int n) {

        int reversed = 0 ;
        while(n!=0){
            int tempReversed = (reversed * 10) + (n%10);
            if(tempReversed/10 != reversed)
                return 0;
            reversed = tempReversed;
            n = n/10;

        }
        return reversed;
    }
}
