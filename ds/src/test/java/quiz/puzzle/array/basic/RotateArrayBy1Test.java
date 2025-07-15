package quiz.puzzle.array.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayBy1Test {
    @Test
    void testRotate_BasicCase() {
        RotateArrayBy1 rotator = new RotateArrayBy1();
        int[] arr = {1, 2, 3, 4, 5};
        rotator.rotate(arr);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr);
    }

    @Test
    void testRotate_AnotherCase() {
        RotateArrayBy1 rotator = new RotateArrayBy1();
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        rotator.rotate(arr);
        assertArrayEquals(new int[]{3, 9, 8, 7, 6, 4, 2, 1}, arr);
    }

    @Test
    void testRotate_SingleElement() {
        RotateArrayBy1 rotator = new RotateArrayBy1();
        int[] arr = {42};
        rotator.rotate(arr);
        assertArrayEquals(new int[]{42}, arr);
    }

    @Test
    void testRotate_EmptyArray() {
        RotateArrayBy1 rotator = new RotateArrayBy1();
        int[] arr = {};
        rotator.rotate(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testRotate_DuplicateElements() {
        RotateArrayBy1 rotator = new RotateArrayBy1();
        int[] arr = {1, 1, 1, 1};
        rotator.rotate(arr);
        assertArrayEquals(new int[]{1, 1, 1, 1}, arr);
    }
}