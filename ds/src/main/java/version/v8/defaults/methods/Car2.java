package version.v8.defaults.methods;

public class Car2 implements Vehicle, FourWheeler{

	@Override
	public void print() {
		System.out.println("\n");
		
		System.out.println("Vehicle implementation");
		Vehicle.super.print();
		
		System.out.println("\nDirect super print 2="+super.getClass());
		System.out.println("FourWheeler Implementation");
		FourWheeler.super.print();
		System.out.println("\nDirect super print="+super.getClass());
		
	}
}
