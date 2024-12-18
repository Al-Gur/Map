package telran.words.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {

    private static Map<Character, Integer> createMap(String string) {
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            res.merge(Character.toUpperCase(string.charAt(i)), 1, (oldValue, value) -> oldValue + value);
        }
        return res;
    }

    public static boolean isAnagram(String word, String part) {
        // Homework
        if (word == null || part == null || part.equals("")) {
            return false;
        }
        Map<Character, Integer> wordMap = createMap(word);
        Map<Character, Integer> partMap = createMap(part);
        Set<Map.Entry<Character, Integer>> partSet = partMap.entrySet();
        for (Map.Entry<Character, Integer> entry : partSet) {
            Character key = entry.getKey();
            if (!wordMap.containsKey(key) || wordMap.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
