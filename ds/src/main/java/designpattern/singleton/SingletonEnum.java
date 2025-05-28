package designpattern.singleton;

import common.dto.Student;

public enum SingletonEnum {
INSTANCE;
	Student student;
	
	public Student getStudent() {
		if(student == null) {
			student = new Student();
		}
		return student;
	}
	
	public Student getStudentNew() {
			return new Student();
	}


	public static void main(String args[]) {

		
		Thread t1 = new Testable();
		Thread t = new Testable();
		Thread t2 = new Testable();
		
		t1.start();
		t.start();
		t2.start();
	}

}

class Testable extends Thread {
	Thread t;

	

	@Override
	public void run() {
		SingletonEnum singleEnum = SingletonEnum.INSTANCE;
		Student ss = new Student();
		System.out.println(singleEnum + " \nHashCode=" + singleEnum.hashCode() + "\nThread Name="+this.getName());
		System.out.println("Hashcode "+ss.hashCode()+"\n");
	}
}
