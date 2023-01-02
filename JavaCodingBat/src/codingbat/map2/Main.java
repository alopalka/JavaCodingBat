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

    public Map<String, Integer> wordLen(String[] strings) {
        Set<String> stringSet = new HashSet<>(Arrays.asList(strings));
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String s : stringSet) {
            stringIntegerMap.put(s, s.length());
        }
        return stringIntegerMap;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> stringStringMap = new HashMap<>();

        for (String string : strings) {
            stringStringMap.put(string.substring(0, 1), string.substring(string.length() - 1));
        }
        return stringStringMap;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (String string : strings) {
            if (stringIntegerMap.containsKey(string)) {
                stringIntegerMap.put(string, stringIntegerMap.get(string) + 1);
            } else {
                stringIntegerMap.put(string, 1);
            }
        }
        return stringIntegerMap;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> stringStringMap = new HashMap<>();
        for (String string : strings) {
            if (stringStringMap.containsKey(string.substring(0, 1))) {
                stringStringMap.put(string.substring(0, 1), stringStringMap.get(string.substring(0, 1)) + string);
            } else {
                stringStringMap.put(string.substring(0, 1), string);
            }
        }
        return stringStringMap;
    }

    public String wordAppend(String[] strings) {
        return strings[0] + strings[strings.length - 1];
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        for (String string : strings) {
            if (stringBooleanMap.containsKey(string)) {
                stringBooleanMap.put(string, true);
            } else {
                stringBooleanMap.put(string, false);
            }
        }
        return stringBooleanMap;
    }


}
