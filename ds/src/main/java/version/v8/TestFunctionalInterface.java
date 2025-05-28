package version.v8;


interface FunctionalInterface{
	// Only 1 abstract method is allowed
	void display(String msg);
	
	//Object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}


interface FuncRule2{
	void display(String msg);
	String abc();
	
	static void val() {
		
	}
	default void text() {
		
	}
}


public class TestFunctionalInterface {

}
