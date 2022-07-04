package training.interview.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static int countCharacters(String[] words, String chars) {

        int[] freq = new int[26];


        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }

        int count = 0;
        for (String word : words){
            int[] temp = freq.clone();
            boolean match = true;
            for (Character c : word.toCharArray()) {
               if(--temp[c - 'a'] < 0){
                   match = false;
                   break;
               }
            }
            if (match)
                count += word.length();

        }

        return count;
    }


    public int countCharacters2(String[] words, String chars) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (!freq.containsKey(chars.charAt(i))) {
                freq.put(chars.charAt(i), 1);
            } else {
                freq.put(chars.charAt(i), freq.get(chars.charAt(i)) + 1);
            }
        }

        int count = 0;
        for (String word : words) {
            if (word.length() <= chars.length()) {


                Map<Character, Integer> wordFreq = new HashMap<>();
                for (int j = 0; j < word.length(); j++) {
                    if (!wordFreq.containsKey(word.charAt(j))) {
                        wordFreq.put(word.charAt(j), 1);
                    } else {
                        wordFreq.put(word.charAt(j), wordFreq.get(word.charAt(j)) + 1);
                    }


                }

                boolean hasAllValue = true;
                for (Map.Entry<Character, Integer> entry : wordFreq.entrySet()) {
                    if (!(freq.containsKey(entry.getKey()) && freq.get(entry.getKey()) >= entry.getValue())) {
                        hasAllValue = false;
                        break;
                    }
                }
                if (hasAllValue)
                    count += word.length();


            }
        }

        return count;
    }
}
