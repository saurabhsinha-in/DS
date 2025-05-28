package version.v8.optionalclass;

import java.util.Optional;

public class OptionalUtils {

	/**
	 * Optional classes are the classes which used to contain not-null objects.
	 * Optional object is used to represent null with absent value
	 * 
	 * Following is the declaration for java.util.Optional<T> class −

public final class Optional<T>
extends Object
	 */
	

	
	
	   protected Integer sum(Optional<Integer> a, Optional<Integer> b){
			
		      //Optional.isPresent - checks the value is present or not
				
		      System.out.println("First parameter is present: " + a.isPresent());
		      System.out.println("Second parameter is present: " + b.isPresent());
				
		      //Optional.orElse - returns the value if present otherwise returns
		      //the default value passed.
		      Integer value1 = a.orElse(Integer.valueOf(0));
				
		      //Optional.get - gets the value, value should be present
		      Integer value2 = b.get();
		      return value1 + value2;
		   }
}
