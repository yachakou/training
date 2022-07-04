package training.interview.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountCharactersTest {
    @Test
    void countCharacters() {
        String[] words = new String[]{"cat", "bt", "hat", "tree"};

        int atach = CountCharacters.countCharacters(words, "atach");

        Assertions.assertEquals(6, atach);
    }
}