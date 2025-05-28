package version.v8.defaults.methods;

public class Car implements Vehicle, FourWheeler{

	/**
	 * First solution is to create an own method that overrides the default implementation.
	 */
	
	@Override
	public void print() {
		System.out.println("Overridden by Car class.");
	}
	
}
