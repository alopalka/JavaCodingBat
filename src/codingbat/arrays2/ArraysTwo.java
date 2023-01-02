package codingbat.arrays2;

import java.util.Collections;
import java.util.List;

public class ArraysTwo {
    public static void main(String[] args) {
    }

//    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0

    public int countEvens(List<Integer> nums) {
        return (int) nums.stream()
                .filter(e -> e % 2 == 1)
                .count();
    }

//    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
//    Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

//    bigDiff([10, 3, 5, 6]) → 7
//    bigDiff([7, 2, 10, 9]) → 8
//    bigDiff([2, 10, 7, 2]) → 8

    public int bigDiff(List<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    public int bigDiffTwo(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        return max - min;
    }


}
