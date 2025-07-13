package quiz.puzzle.array.easy;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountDigitsTest {

    @Test
    public void testExampleCases() {
        assertEquals(2, CountDigits.evenlyDivides(12));    // 1 and 2 divide 12
        assertEquals(1, CountDigits.evenlyDivides(2446));  // only 2 divides 2446
        assertEquals(0, CountDigits.evenlyDivides(23));    // neither 2 nor 3 divide 23
    }

    @Test
    public void testWithZeroDigit() {
        assertEquals(3, CountDigits.evenlyDivides(1012));  // 1, 1, 2 divide 1012; 0 ignored
        assertEquals(1, CountDigits.evenlyDivides(10));    // only 1 divides 10; 0 ignored
    }

    @Test
    public void testAllDigitsDivide() {
        assertEquals(3, CountDigits.evenlyDivides(111));   // all 1s divide 111
    }

    @Test
    public void testNoDigitsDivide() {
        assertEquals(0, CountDigits.evenlyDivides(37));    // neither 3 nor 7 divide 37
    }

}
