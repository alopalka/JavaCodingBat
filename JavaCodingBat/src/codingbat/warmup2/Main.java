package codingbat.warmup2;

public class Main {
    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        String varable = "";
        for (int i = 0; i < n; i++) {
            varable += str;
        }
        return varable;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(0, Math.min(str.length(), 3));
        }
        return result;
    }

    public int countXX(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                counter++;
            }
        }

        return counter;
    }

    public boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i+1) == 'x'){
                    return true;
                }
                return false;
            }
        }
        return false;
    }

}
