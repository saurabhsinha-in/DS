package quiz.puzzle.array.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayDuplicatesTest {

    // Assuming findDuplicates is static in ArrayDuplicates class
    @Test
    void testSampleCase1() {
        Integer[] input = {2, 3, 1, 2, 3};
        Integer[] expected = {2, 3};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        Arrays.sort(actual); // Ensure order for comparison
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSampleCase2() {
        Integer[] input = {0, 3, 1, 2};
        Integer[] expected = {};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSampleCase3() {
        Integer[] input = {2};
        Integer[] expected = {};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testAllDuplicates() {
        Integer[] input = {1, 1, 1, 1};
        Integer[] expected = {1};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMultipleDuplicates() {
        Integer[] input = {4, 5, 6, 4, 5, 6, 7};
        Integer[] expected = {4, 5, 6};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testEmptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testNoDuplicatesWithNegatives() {
        Integer[] input = {-1, 0, 1, 2};
        Integer[] expected = {};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testMultipleDuplicates1() {
        int[] input = {2, 4, 5, 5, 3, 0, 1};
        Integer[] expected = { 5};
        Integer[] actual = ArrayDuplicates.findDuplicates(input).toArray(new Integer[0]);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
