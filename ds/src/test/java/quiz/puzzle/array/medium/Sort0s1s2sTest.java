package quiz.puzzle.array.medium;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;
import static quiz.puzzle.array.medium.Sort0s1s2s.sort012;

public class Sort0s1s2sTest {

    @Test
    public void testAllZeros() {
        int[] input = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAllOnes() {
        int[] input = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAllTwos() {
        int[] input = {2, 2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2, 2};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMixedOrder() {
        int[] input = {2, 0, 1, 2, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElement() {
        int[] input = {1};
        int[] expected = {1};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMinimalCase() {
        int[] input = {2, 0};
        int[] expected = {0, 2};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testAlreadySorted() {
        int[] input = {0, 0, 1, 1, 2, 2};
        int[] expected = {0, 0, 1, 1, 2, 2};
        sort012(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverseSorted() {
        int[] input = {2, 2, 1, 1, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        sort012(input);
        assertArrayEquals(expected, input);
    }
}