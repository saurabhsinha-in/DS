package quiz.puzzle.array.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingAndRepeatingTest {

    private final MissingAndRepeating solution = new MissingAndRepeating();

    @Test
    void testSmallestArray() {
        int[] input = {2, 2};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 1));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testExample2() {
        int[] input = {1, 3, 3};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testExample3() {
        int[] input = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 5));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testMissingAtEnd() {
        int[] input = {1, 2, 3, 4, 4};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testMissingInMiddle() {
        int[] input = {1, 2, 2, 4, 5};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testMissingFirstElement() {
        int[] input = {2, 3, 4, 4, 5};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 1));
        assertEquals(expected, solution.findTwoElement(input));
    }

    @Test
    void testAnotherCase() {
        int[] input = {3, 1, 3, 4, 5};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 2));
        assertEquals(expected, solution.findTwoElement(input));
    }
}