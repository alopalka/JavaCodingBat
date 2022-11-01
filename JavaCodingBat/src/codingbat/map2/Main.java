package codingbat.map2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public Map<String, Integer> word0(String[] strings) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        Map<String, Integer> stringStringMap = new HashMap<>();

        for (String s : stringSet) {
            stringStringMap.put(s, 0);
        }
        return stringStringMap;
    }

    
}
