package codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

//    Given a list of integers, return a list of the integers, omitting any that are less than 0.
//
//    noNeg([1, -2]) → [1]
//    noNeg([-3, -3, 3, 3]) → [3, 3]
//    noNeg([-1, -1, -1]) → []

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

}
