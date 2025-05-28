package designpattern.singleton;

import org.junit.Test;

import common.dto.Student;

public class SingletonEnumTest {

	@Test
	public void testGetStudent() {
		SingletonEnum singleEnum = SingletonEnum.INSTANCE;
		Student stud = singleEnum.getStudent();
		stud.setName("Saurabh");
		System.out.println(stud.hashCode());
		Student stud11 = singleEnum.getStudentNew();
		stud11.setName("Saurabh 11");
		System.out.println(stud11.hashCode());
		
		SingletonEnum singleEnum1 = SingletonEnum.INSTANCE;
		Student stud1 = singleEnum1.getStudent();
		System.out.println(stud1.getName());
		System.out.println(stud1.hashCode());
		Student stud12 = singleEnum1.getStudentNew();
		System.out.println(stud12.getName());
		System.out.println(stud12.hashCode());
		
	}
	
	private void printThreadDetails(){
		SingletonEnum singleEnum = SingletonEnum.INSTANCE;
		System.out.println(singleEnum+ " \nHashCode="+singleEnum.hashCode()+"\nThread Name=");
	}
	
	@Test
	public void testThreadEnum(){
		Runnable r = () -> {
			printThreadDetails();
		};
		Runnable r1 = () -> {
			printThreadDetails();
		};
		
		Runnable r2 = () -> {
			printThreadDetails();
		};
		Thread t1 = new Thread(r1);
		Thread t = new Thread(r);
		Thread t2 = new Thread(r2);
		t1.start();
		t.start();
		t2.start();
		
		
	}

}
