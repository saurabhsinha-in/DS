package core.hashcode;

import java.util.HashMap;
import java.util.Map;

import common.dto.Student;

public class HashCodeInMap {

	
	
	public static void main(String args[]){
		Map<Object, Object> mapTest = new HashMap<>();
		
		
		mapTest.put(new Student(), "Tests");
		mapTest.put(new Student(), "Test");
		
		System.out.println(mapTest.get(new Student())+" map size=="+mapTest.size());
		

		mapTest.put(new Student("Tests","test",23), "Tests");
		mapTest.put(new Student("Test","test",23), "Test");
		System.out.println(mapTest.get(new Student("Test","test",23))+" map size=="+mapTest.size());

		Student s1 = new Student("Tests","test",23);
		Student s2 = new Student("Test","test",23);
		mapTest.put(s1, "Tests2");
		mapTest.put(s2, "Test2");
		System.out.println(mapTest.get(s2)+" map size=="+mapTest.size());
		
	}
	
}
