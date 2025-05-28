package version.v8.streams;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class StreamUtilsTest {

	String actualArr[] = new String[] { "abc", "", "bc", "efg", "abcd", "", "jkl" };

	StreamUtils su = new StreamUtils();

	@Test
	public void testGenerateStream() {
		String expectedArr[] = new String[] { "abc", "bc", "efg", "abcd", "jkl" };
		List<String> str = su.removeBlankString(actualArr);
		Assert.assertArrayEquals(expectedArr, str.toArray(new String[] {}));
	}

	@Test
	public void testSearchString() {
		String expectedArr[] = new String[] { "abc", "bc", "abcd" };
		List<String> str = su.searchString(expectedArr, "bc");
		Assert.assertArrayEquals(expectedArr, str.toArray(new String[] {}));
	}

//	@Test
//	public void testPrintRandomNumber() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testPrintStudentAge() {
//		fail("Not yet implemented");
//	}

}
