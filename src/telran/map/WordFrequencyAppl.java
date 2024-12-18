package telran.map;

import java.util.*;

public class WordFrequencyAppl {
    public static void main(String[] args) {
        String[] words = {"abc", "ab", "limn", "limn", "ab", "limn", "a"};
        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String[] words) {
        Map<String, Integer> res = new HashMap<>();
        for (String str : words) {
//            if (!res.containsKey(str)) {
//                res.put(str, 1);
//            } else {
//                res.put(str, res.get(str) + 1);
//            }

//            if (res.putIfAbsent(str, 1) != null) {
//                res.put(str, res.get(str) + 1);
//            }

//            res.computeIfPresent(str, (k, v) -> v + 1);
//            res.computeIfAbsent(str, k -> 1);

            res.merge(str, 1, (oldValue, value) -> oldValue + value);

        }
        System.out.println("=== Unsorted ===");
        Set<Map.Entry<String, Integer>> entries = res.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("=== Sorted by frequency ===");
        // Homework desc
        Set<Map.Entry<String, Integer>> entriesSortedByFrequency = new TreeSet<Map.Entry<String, Integer>>(
                (entry1, entry2) -> {
                    int f = Integer.compare(entry1.getValue(), entry2.getValue());
                    return f != 0 ? -f : entry1.getKey().compareTo(entry2.getKey());
                }
        );
        entriesSortedByFrequency.addAll(entries);
        for (Map.Entry<String, Integer> entry : entriesSortedByFrequency) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
