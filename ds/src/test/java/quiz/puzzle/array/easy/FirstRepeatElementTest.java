package quiz.puzzle.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstRepeatElementTest {

    @Test
    void testExample1() {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        Assertions.assertEquals(2, FirstRepeatElement.firstRepeated(arr));
    }

    @Test
    void testExample2() {
        int[] arr = {1, 2, 3, 4};
        Assertions.assertEquals(-1, FirstRepeatElement.firstRepeated(arr));
    }

    @Test
    void testMultipleRepeats() {
        int[] arr = {4, 4, 4, 4};
        Assertions.assertEquals(1, FirstRepeatElement.firstRepeated(arr));
    }

    @Test
    void testFirstRepeatAtEnd() {
        int[] arr = {7, 8, 9, 7};
        Assertions.assertEquals(1, FirstRepeatElement.firstRepeated(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        Assertions.assertEquals(-1, FirstRepeatElement.firstRepeated(arr));
    }

}