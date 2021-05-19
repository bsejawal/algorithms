package com.bsejawal.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Algorithms {

    /**
     * https://leetcode.com/problems/two-sum/
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> num_map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(num_map.containsKey(complement)){
                result[0] = num_map.get(complement);
                result[1] = i;
                return result;
            }else{
                num_map.put(nums[i], i);
            }
        }
        return result;
    }


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
