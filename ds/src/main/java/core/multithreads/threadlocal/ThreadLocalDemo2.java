package core.multithreads.threadlocal;
class CustomerThread extends Thread{
	
	
	
	static Integer custId = 0;
	private static ThreadLocal<Integer> tl = new ThreadLocal<Integer>(){
		protected Integer initialValue(){
			return ++custId;
		}};
	public CustomerThread(String name) {
		super(name);		
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" executing with custId: "+tl.get());
		X();
	}
	
	
	private static void X(){
		System.out.println("X");
		Y();
		System.out.println("Y");
		
	}
	private static void Y(){
		System.out.println("XA");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("YA");
	}
	
}
public class ThreadLocalDemo2 {
	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("T1");
		CustomerThread c2 = new CustomerThread("T2");
		CustomerThread c3 = new CustomerThread("T3");
		CustomerThread c4 = new CustomerThread("T4");
		c1.start();
//		c2.start();
//		c3.start();
//		c4.start();
	}
}
