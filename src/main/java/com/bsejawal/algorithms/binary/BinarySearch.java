package com.bsejawal.algorithms.binary;

import com.bsejawal.algorithms.NumUtils;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int i[] = new int[]{1,3,4,5,6,7,8};
//        BinarySearch b = new BinarySearch();
//        System.out.println(b.binarySearchWhileLoop(i, 8));
        System.out.println(NumUtils.generateRandomNumber());
    }

    public int binarySearchWhileLoop(int[] list, int target ){
        System.out.println("list = " + Arrays.toString(list) + ", target = " + target);
        int left = 0;
        int right = list.length-1;
        int count =1;
        while(left <= right){
            int middle = (left + right) /2;
            if(target < list[middle]){
                right = middle-1;
            }else if(target > list[middle]){
                left = middle+1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] array, int target, int left, int right){
        if(left > right)
            return -1;
        int middle = (left + right) / 2;
        if(target == array[middle]) return middle;
        else if(target < array[middle])
            return binarySearchRecursive(array, target, left, middle-1);
        else
            return binarySearchRecursive(array, target, middle+1, right);
    }


    public int binarySearchRecursive(int[] array, int target){

        return binarySearchRecursive(array, target, 0, array.length-1);


    }


}
