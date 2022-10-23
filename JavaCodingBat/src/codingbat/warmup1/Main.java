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

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b < 0 && negative) {
            return true;
        }
        if (!negative) {
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                return true;
            }
        }
        return false;
    }

    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

    public String notString2(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not" + str;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }

    public boolean mixStart(String str) {
        return str.length() > 2 ? str.substring(1, 3).equals("ix") : false;
    }


}
