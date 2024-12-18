package telran.words.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.words.utils.Anagram.isAnagram;

class AnagramTest {
    private String word = "electricity";

    @Test
    void testIsAnagram() {
        assertTrue(isAnagram(word, "city"));
        assertTrue(isAnagram(word, "City"));
        assertTrue(isAnagram(word, "tic"));
        assertTrue(isAnagram(word, "rele"));
        assertTrue(isAnagram(word, "tele"));
    }

    @Test
    void testIsNotAnagram(){
        assertFalse(isAnagram(word, "tell"));
        assertFalse(isAnagram(word, ""));
        assertFalse(isAnagram(word, null));
        assertFalse(isAnagram(word, "select"));
        assertFalse(isAnagram(word, "collect"));
    }

}