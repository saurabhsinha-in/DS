package quiz.puzzle.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoveAllZeroesEndTest {

    @Test
    void testExample1() {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, arr);
    }

    @Test
    void testExample2() {
        int[] arr = {10, 20, 30};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{10, 20, 30}, arr);
    }

    @Test
    void testExample3() {
        int[] arr = {0, 0};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{0, 0}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testAllZeroes() {
        int[] arr = {0, 0, 0, 0};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0}, arr);
    }

    @Test
    void testNoZeroes() {
        int[] arr = {1, 2, 3, 4};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    void testZeroesAtStart() {
        int[] arr = {0, 0, 1, 2};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 0, 0}, arr);
    }

    @Test
    void testZeroesAtEnd() {
        int[] arr = {1, 2, 0, 0};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 0, 0}, arr);
    }

    @Test
    void testSingleElementZero() {
        int[] arr = {0};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{0}, arr);
    }

    @Test
    void testSingleElementNonZero() {
        int[] arr = {7};
        MoveAllZeroesEnd.moveZeroes(arr);
        assertArrayEquals(new int[]{7}, arr);
    }
}
