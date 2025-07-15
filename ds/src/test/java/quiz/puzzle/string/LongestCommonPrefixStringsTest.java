package quiz.puzzle.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixStringsTest {

    @Test
    void testCommonPrefixExists() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        assertEquals("gee", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testNoCommonPrefix() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"hello", "world"};
        assertEquals("", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testAllStringsIdentical() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"test", "test", "test"};
        assertEquals("test", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testEmptyArray() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {};
        assertEquals("", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testSingleElementArray() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"single"};
        assertEquals("single", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testPrefixIsEmptyString() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"", "abc", "abcd"};
        assertEquals("", lcp.longestCommonPrefix(arr));
    }

    @Test
    void testPrefixWithSpecialCharacters() {
        LongestCommonPrefixStrings lcp = new LongestCommonPrefixStrings();
        String[] arr = {"@home", "@house", "@host"};
        assertEquals("@ho", lcp.longestCommonPrefix(arr));
    }
}
