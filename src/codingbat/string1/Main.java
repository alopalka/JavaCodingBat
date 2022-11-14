package codingbat.string1;

public class Main {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String withouEnd2(String str) {
        return str.length() > 1 ? str.substring(1, str.length() - 1) : "";
    }

    public String middleTwo(String str) {
        return str.length() > 1 ? str.substring(str.length() / 2 - 1, str.length() / 2 + 1) : "";
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly") ? true : false;
    }

    public String twoChar(String str, int index) {
        if (index < str.length() - 1 && index > 0) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }


}
