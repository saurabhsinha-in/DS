package core.multithreads.latch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

	public void processExchange() {
		Exchanger<Student> ex = new Exchanger<>();
		
		Runnable student = ()->{
			Student s = new Student("Saurabh", "32");
			try {
				Thread.sleep(3000);
				ex.exchange(s);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable student1 = ()->{
			Student s = new Student("Vaibhav", "32");
			try {
				System.out.println(s.toString());
				
				List<Student> list = new ArrayList<>();
				list.add(s);
				for(int i=0;i<2;i++) {
					list.add(ex.exchange(s));
				}
				
//				System.out.println(s2.toString());
//				List<Student> list = Arrays.asList(new Student[] {s,s2});
				System.out.println(list);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable student2 = ()->{
			Student s = new Student("Abhesh", "32");
			try {
//				System.out.println(s.toString());
				ex.exchange(s);
//				System.out.println(s2.toString());
//				List<Student> list = Arrays.asList(new Student[] {s,s2});
//				System.out.println(list);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t = new Thread(student);
		Thread t1 = new Thread(student1);
		Thread t2 = new Thread(student2);
		t.start();
		t1.start();
		t2.start();
		
		
	}

	public static void main(String[] args) {
		ExchangerExample ee = new ExchangerExample();
		ee.processExchange();

	}

	class Student {
		String name;
		String age;
		public Student(String name, String age) {
			super();
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
		

	}
}
