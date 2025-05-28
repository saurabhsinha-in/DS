package version.v8.optionalclass;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;


public class OptionalUtilsTest {
	
	OptionalUtils optUtils = new OptionalUtils();

	@Test
	public void testInit() {
		
		Integer value1 = null;
	    Integer value2 = Integer.valueOf(10);
		
		
		//Optional.ofNullable - allows passed parameter to be null.
	      Optional<Integer> a = Optional.ofNullable(value1);
			
	      //Optional.of - throws NullPointerException if passed parameter is null
	      Optional<Integer> b = Optional.of(value2);
		Integer val = optUtils.sum(a, b);
		Assert.assertEquals(Integer.valueOf(10), val);
	}

}
