package version.v8.defaults.methods;

public class CommonMain {
	
	public static void main(String args[]){
		Food f = new Food();
		f.print();
		
		Food2 f2 = new Food2();
		f2.print();
	}
}

interface Rice{
	default void print(){
		System.out.println("Print Rice");
	}
	
	static void quantity(){
		System.out.println("Print the quantity");
	}
	
}

interface Wheat{
	default void print(){
		System.out.println("Print Wheat");
	}
}

class Food implements Rice, Wheat{
	
	/**
	 * First solution is to implement its own print class.
	 */
	@Override
	public void print() {
		System.out.println("\nPrinting the Food override.\n");
	}
}

class Food2 implements Rice, Wheat{
	
	/**
	 * It can calls the method of Rice and its Wheat class
	 */
	@Override
	public void print() {

		System.out.println("\nCalling the Rice class");
		Rice.super.print();
		System.out.println("Directly calling the static method");
		Rice.quantity();
		
		
		System.out.println("\nCalling the Wheat Class");
		Wheat.super.print();
		
		
		
	}
}



