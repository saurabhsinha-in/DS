package quiz.puzzle.array;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinJumpsTest {

    @Test
    public void testExample1() {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        assertEquals(3, MinJumps.minJumps(arr));
    }

    @Test
    public void testExample2() {
        int[] arr = {1, 4, 3, 2, 6, 7};
        assertEquals(2, MinJumps.minJumps(arr));
    }

    @Test
    public void testExample3() {
        int[] arr = {0, 10, 20};
        assertEquals(-1, MinJumps.minJumps(arr));
    }

    @Test
    public void testTwoElementsPossible() {
        int[] arr = {1, 0};
        assertEquals(1, MinJumps.minJumps(arr));
    }

    @Test
    public void testTwoElementsImpossible() {
        int[] arr = {0, 0};
        assertEquals(-1, MinJumps.minJumps(arr));
    }

    @Test
    public void testAllOnes() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(3, MinJumps.minJumps(arr));
    }

    @Test
    public void testDirectJumpToEnd() {
        int[] arr = {5, 0, 0, 0};
        assertEquals(1, MinJumps.minJumps(arr));
    }

    @Test
    public void testOptimalPathSelection() {
        int[] arr = {2, 3, 1, 1, 4};
        assertEquals(2, MinJumps.minJumps(arr));
    }

    @Test
    public void testUnreachableEnd() {
        int[] arr = {1, 2, 0, 0, 1};
        assertEquals(-1, MinJumps.minJumps(arr));
    }

    @Test
    public void testSingleStepAtEnd() {
        int[] arr = {2, 1, 0, 1};
        assertEquals(-1, MinJumps.minJumps(arr));
    }
}
