package codingbat.warmup1;

public class Main {

    public static void main(String[] args) {

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday){
            if (vacation){
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
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile && bSmile){
            return true;
        }
        return false;
    }

}
