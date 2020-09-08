package algorithms.sorting;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

/**
 * Worst complexity: n^2
 * Average complexity: n^2
 * Best complexity: n
 * Space complexity: 1
 * Method: Exchanging
 * Stable: Yes
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] unSorted = numbers(20);
        System.out.println(toString(unSorted) + " <- unsorted");
        int sorted[] = bubbleSort(unSorted);
        System.out.println(toString(sorted) + " <- sorted ");

    }

    static int[] numbers(int count) {
        int max = count * 20;
        int min = 0;
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            int range = max - min + 1;
            numbers[i] = (int) (Math.random() * range) + min;
        }
        return numbers;
    }

    static int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            System.out.println(toString(list));
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j])
                    minIndex = j;
            }
            int temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
        return list;
    }

    static String toString(int[] list) {
        return Arrays.stream(list).mapToObj(new IntFunction<String>() {

            @Override
            public String apply(int value) {
                return String.valueOf(value);
            }
        })
                .reduce(new BinaryOperator<String>() {
                    @Override
                    public String apply(String s, String s2) {
                        return s.concat(", " + s2);
                    }
                }).get();

    }

}