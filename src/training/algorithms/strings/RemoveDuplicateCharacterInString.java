package training.algorithms.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterInString {
    public static void main(String[] args) {

        String abcaabmop = "abcaabmop";
        findDuplicateCharacterInString(abcaabmop);
    }

    public static List<String> findDuplicateCharacterInString(String input) {

        char[] chars = input.toCharArray();
        Map<Character, Integer> count = new HashMap<>();

        for (char aChar : chars) {
            if (!count.containsKey(aChar)) {
                count.put(aChar, 1);
            } else {
                count.computeIfPresent(aChar, (k, v) -> v + 1);
            }
        }
        count.forEach((k, v) -> {
            if (v > 1) {
                System.out.printf("Find %d duplicate for letter %s \n", v, k);
            }
        });
        return count.entrySet().stream()
                .filter((k) -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}
