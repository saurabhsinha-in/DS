package version.v8.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacesUtils {

	/**
	 public @interface FunctionalInterface
An informative annotation type used to indicate that an interface type declaration is intended to be a functional
interface as defined by the Java Language Specification. Conceptually, a functional interface has exactly one abstract
 method. Since default methods have an implementation, they are not abstract. If an interface declares an abstract
 method overriding one of the public methods of java.lang.Object, that also does not count toward the interface's
 abstract method count since any implementation of the interface will have an implementation from java.lang.Object or 
 elsewhere.
Note that instances of functional interfaces can be created with lambda expressions, method references, or
constructor references.

If a type is annotated with this annotation type, compilers are required to generate an error message unless:

The type is an interface type and not an annotation type, enum, or class.
The annotated type satisfies the requirements of a functional interface.
However, the compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterface annotation is present on the interface declaration.
	 */
	public void init(){
	      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
			
	      // Predicate<Integer> predicate = n -> true
	      // n is passed as parameter to test method of Predicate interface
	      // test method will always return true no matter what value n has.
			
	      System.out.println("Print all numbers:");
			
	      //pass n as parameter
	      eval(list, n->true);
			
	      // Predicate<Integer> predicate1 = n -> n%2 == 0
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n%2 comes to be zero
			
	      System.out.println("Print even numbers:");
	      eval(list, n-> n%2 == 0 );
			
	      // Predicate<Integer> predicate2 = n -> n > 3
	      // n is passed as parameter to test method of Predicate interface
	      // test method will return true if n is greater than 3.
			
	      System.out.println("Print numbers greater than 3:");
	      eval(list, n-> n > 3 );
	      
	      System.out.println("Numbers divide by 4");
	      eval(list, n->n%4 == 0);
	      
	}
	
	private static void eval(List<Integer> list, Predicate<Integer> predicate) {
	      for(Integer n: list) {
			
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
	
}
