package telran.map;

import java.util.*;

public class MapIntroAppl {
    public static void main(String[] args) {
        Map<String, Integer> cities = new TreeMap<>();
        cities.put("Denver", 600_000);
        cities.put("Boston", 670_000);
        cities.put("Chicago", 2_700_000);
        cities.put("Atlanta", 470_000);
        cities.put("New York", 8_500_000);
        cities.put("Dallas", 1_300_000);

        Integer population = cities.get("Chicago");
        System.out.println(population);
        population = cities.get("Detroit");
        System.out.println(population);
        System.out.println(cities.size());
        System.out.println(cities.isEmpty());

        System.out.println(cities.containsKey("Boston"));
        System.out.println(cities.containsKey("Detroit"));

        System.out.println(cities.containsValue(600_000));
        System.out.println(cities.containsValue(700_000));

        population = cities.put("Chicago", 2_700_001);
        System.out.println(population);
        population = cities.get("Chicago");
        System.out.println(population);
        int total = 0;
        Collection<Integer> values = cities.values();
        for (Integer num : values) {
            total += num;
        }
        System.out.println("Population = " + total);
        System.out.println("=== method 1 ===");
        Set<String> keys = cities.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + cities.get(key));
        }
        System.out.println("=== method 2 ===");
        Set<Map.Entry<String, Integer>> entries = cities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
