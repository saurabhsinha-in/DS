package version.v8.lambada;

public class LambadaUtils {
	
	public void init(){
		operatorsAction();
		interfaceImpl();
	}
	
	/**
	 
	 A lambda expression is characterized by the following syntax −

	parameter -> expression body
	
	 Following are the important characteristics of a lambda expression −

Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.
	 
	 
	 */
	
	
	public void operatorsAction(){
		   //with type declaration
	    MathOperation addition = (int a, int b) -> a + b;
			
	    //with out type declaration
	    MathOperation subtraction = (a, b) -> a - b;
			
	    //with return statement along with curly braces
	    MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	    //without return statement and without curly braces
	    MathOperation division = (int a, int b) -> a / b;
			
	    System.out.println("10 + 5 = " + operate(10, 5, addition));
	    System.out.println("10 - 5 = " + operate(10, 5, subtraction));
	    System.out.println("10 x 5 = " + operate(10, 5, multiplication));
	    System.out.println("10 / 5 = " + operate(10, 5, division));
			
	    //with parenthesis
	    GreetingService greetService1 = message ->
	    System.out.println("Hello 1 " + message);
			
	    //without parenthesis
	    GreetingService greetService2 = (message) ->
	    System.out.println("Hello 2 " + message);
			
	    greetService1.sayMessage("Mahesh");
	    greetService2.sayMessage("Suresh");

	}
	
	
	/**
	 * This method is for implementing the interface method
	 */
	public void interfaceImpl(){
		
		/** It is the method implementation of MathOperation*/
		MathOperation average = (a,b) -> (a+b)/2;
		
		/** Using the implementation of average of that method */
		
		System.out.println("Printing the average of value provided="+average.operation(20, 30));
	}
	
	
	
	
	
 interface MathOperation {
    int operation(int a, int b);
    
 }
	
 interface GreetingService {
    void sayMessage(String message);
 }
	
 private int operate(int a, int b, MathOperation mathOperation){
    return mathOperation.operation(a, b);
 }
}
