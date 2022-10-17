package codingbat.warmup1;

public class Main {

    public static void main(String[] args) {

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday) {
            if (vacation) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || (!aSmile && !bSmile);
    }

    public boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && bSmile) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        return a == b ? 4 * a : a + b;
    }

    public int diff21(int n) {
        if (n < 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }


}
