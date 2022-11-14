package codingbat.arrays2;

import java.util.List;

public class ArraysTwo {
    public static void main(String[] args) {
    }

    public int countEvens(List<Integer> nums) {
        return (int) nums.stream()
                .filter(e -> e % 2 == 1)
                .count();
    }
}
