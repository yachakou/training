package training.algorithms.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String hello = "hello";
        System.out.printf("The first non repeated char is %s", findFirstNonRepeatedCharacter(hello));
    }

    public static String findFirstNonRepeatedCharacter(String hello) {
        final LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>(hello.length());
        for (char charr : hello.toCharArray()) {
            linkedHashMap.put(charr, linkedHashMap.containsKey(charr) ? linkedHashMap.get(charr) + 1 : 1);
        }
        return linkedHashMap.entrySet().stream()
                .filter((k) -> k.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .orElseThrow(RuntimeException::new);
    }
}
