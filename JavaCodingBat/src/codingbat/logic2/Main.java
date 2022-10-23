package codingbat.logic2;

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
}
