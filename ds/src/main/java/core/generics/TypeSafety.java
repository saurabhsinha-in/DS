package core.generics;

import java.util.ArrayList;

public class TypeSafety {
	public static void main(String args[]) {

	}
	
	private void typeSafteySample() {
		String s[] = new String[10000];
		s[0] = "Test";
		s[1] = "Test1";
		//This is not type Safe
//		s[2] = new Integer(10);
	}
	
	/**
	 * Different type of object can be added but while accessing it give problem
	 */
	private void typeSafeArrayList() {
		ArrayList l = new ArrayList<>();
		l.add("ee");
		l.add("Test");
		l.add(new Integer(10));
		String name0= (String) l.get(0);
		String name1= (String) l.get(1);
		//This will give type cast exception since holds the 
		//INteger value
		String name2= (String) l.get(2);
	}
	
	private void typeCastingNotRequired() {
		String s[] = new String[10000];
		s[0] = "Test";
		
		//Type Casting is not required
		String name1 = s[0];
	}
	
	private void typeCastForArrayList() {
		ArrayList l = new ArrayList<>();
		l.add("ee");
		//Incompatible types requires String
//		String name1 = l.get(0); //Compile time error.
		
		String name1 = (String)l.get(0);
		
	}
	private void typeCastCompileError() {
		ArrayList<String> l = new ArrayList<>();
		l.add("ee");
		l.add("Test");
//		l.add(new Integer(10)); Compile Error 
//		hence getting type safety
	}
	
	private void genericTypesTypecatingNotRequired() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Test");
		String namee = l.get(0); //Type Safety is not required
	}
	
}
