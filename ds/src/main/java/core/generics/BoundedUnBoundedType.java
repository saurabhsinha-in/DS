package core.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedUnBoundedType {

	
	public void wildCardSample() {
		ArrayList<String> l = new ArrayList<String>();
		ArrayList<?> l1 = new ArrayList<String>();
		ArrayList<? extends Number> l3 = new ArrayList<Integer>();
		//Incompatible types
//		ArrayList<? extends Number> l2= new ArrayList<String>();
		ArrayList<? super String> l4 = new ArrayList<Object>();
		
	}
	
}
class Test<T extends Number>{
	public static void main(String[] args) {
		Test<Integer> t1 = new Test<Integer>();
		// Not valid if it extends NUmber
//		Test<String> t2 = new Test<String>();//valid if not extended //with number. Not valid if it extends NUmber
		
	}
	
	
	
	
}
