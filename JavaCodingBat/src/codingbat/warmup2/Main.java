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
                if (str.charAt(i + 1) == 'x') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String resultString = "";
        for (int i = 0; i < str.length(); i += 2) {
            resultString += str.charAt(i);
        }
        return resultString;
    }

    public String stringSplosion(String str) {
        String resultString = "";
        for (int i = 0; i < str.length(); i++) {
            resultString += str.substring(0, i + 1);
        }
        return resultString;
    }

    public int last2(String str) {
        int counter = 0;
        String pattern = str.substring(0, 1);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals(pattern)) {
                counter++;
            }
        }
        return counter;
    }


}
