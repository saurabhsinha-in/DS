package quiz.puzzle.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static quiz.puzzle.array.ArrayLeaders.getLeader;

class ArrayLeadersTest {

    @Test
    void testGetLeader_basicCase() {
        Integer[] input = {16, 17, 4, 3, 5, 2};
        Integer[] expected = {17, 5, 2};
        assertArrayEquals(expected, getLeader(input));
    }

    @Test
    void testGetLeader_allLeaders() {
        Integer[] input = {5, 4, 3, 2, 1};
        Integer[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, getLeader(input));
    }

    @Test
    void testGetLeader_singleElement() {
        Integer[] input = {10};
        Integer[] expected = {10};
        assertArrayEquals(expected, getLeader(input));
    }

    @Test
    void testGetLeader_noLeadersExceptLast() {
        Integer[] input = {1, 2, 3, 4, 5};
        Integer[] expected = {5};
        assertArrayEquals(expected, getLeader(input));
    }

    @Test
    void testGetLeader_emptyArray() {
        Integer[] input = {};
        Integer[] expected = {};
        assertArrayEquals(expected, getLeader(input));
    }
}