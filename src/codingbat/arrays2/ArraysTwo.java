package codingbat.arrays2;

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
}
