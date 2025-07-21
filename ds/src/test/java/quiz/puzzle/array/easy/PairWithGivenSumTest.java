package quiz.puzzle.array.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PairWithGivenSumTest {

    @Test
    void testExample1() {
        int[] arr = {0, -1, 2, -3, 1};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertTrue(solver.twoSum(arr, -2));
    }

    @Test
    void testExample2() {
        int[] arr = {1, -2, 1, 0, 5};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertFalse(solver.twoSum(arr, 0));
    }

    @Test
    void testSingleElement() {
        int[] arr = {11};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertFalse(solver.twoSum(arr, 11));
    }

    @Test
    void testNoPairExists() {
        int[] arr = {1, 2, 3, 4, 5};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertFalse(solver.twoSum(arr, 10));
    }

    @Test
    void testPairExistsAtStartAndEnd() {
        int[] arr = {-3, 1, 2, 4, 6, 5};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertTrue(solver.twoSum(arr, 2));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertFalse(solver.twoSum(arr, 5));
    }

    @Test
    void testSameElementButDistinctIndices() {
        int[] arr = {3, 3, 3, 3};
        PairWithGivenSum solver = new PairWithGivenSum();
        assertTrue(solver.twoSum(arr, 6));
    }
}
