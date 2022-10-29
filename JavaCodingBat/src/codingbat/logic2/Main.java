package codingbat.logic2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 2, 9));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int lastDigit = goal % 10;
        if (small + (big * 5) < goal) {
            return false;
        }
        if (lastDigit < 5 && small < lastDigit) {
            return false;
        }
        if (lastDigit > 5 && lastDigit > small + 5) {
            return false;
        }
        return true;
    }

    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }


}
