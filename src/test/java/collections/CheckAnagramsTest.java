package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckAnagramsTest {

    @Test
    void areAnagrams() {
        assertTrue(CheckAnagrams.areAnagrams("dusty", "study"));
        assertTrue(CheckAnagrams.areAnagrams("elbow", "below"));
        assertTrue(CheckAnagrams.areAnagrams("night", "thing"));
        assertTrue(CheckAnagrams.areAnagrams("peach", "cheap"));
        assertFalse(CheckAnagrams.areAnagrams("peach", "chekp"));
        assertFalse(CheckAnagrams.areAnagrams("peach", "cheep"));
        assertFalse(CheckAnagrams.areAnagrams("peach", " cheap"));
        assertFalse(CheckAnagrams.areAnagrams("peach", "cheap "));
        assertFalse(CheckAnagrams.areAnagrams("", "cheap"));
        assertFalse(CheckAnagrams.areAnagrams("peach", ""));
    }
}