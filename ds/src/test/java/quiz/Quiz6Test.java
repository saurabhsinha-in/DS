package quiz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Quiz6Test {

	Quiz6 quiz = new Quiz6();

	@Test
	public void test() {
		assertEquals("z", quiz.getResponse1("A quick brown fox jumps over the lay dog"));
		assertEquals(null, quiz.getResponse1("A quick brown fox jumps over the lazy dog"));
		assertEquals("bz", quiz.getResponse1("A quick rown fox jumps over the lay dog"));
	}

	@Test
	public void test1() {
		assertTrue(quiz.isWordExists1("BFD"));
		assertTrue(quiz.isWordExists1("CCE"));
		assertTrue(quiz.isWordExists1("ESE"));
		assertTrue(quiz.isWordExists1("BCE"));
		assertTrue(quiz.isWordExists1("CS"));

	}

	@Test
	public void test2() {
		char arr[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(quiz.isWordExists2(arr, "BFD"));
		assertTrue(quiz.isWordExists2(arr, "CCE"));
		assertTrue(quiz.isWordExists2(arr, "ESE"));
		assertTrue(quiz.isWordExists2(arr, "BCE"));
		assertTrue(quiz.isWordExists2(arr, "CS"));
	}

}
