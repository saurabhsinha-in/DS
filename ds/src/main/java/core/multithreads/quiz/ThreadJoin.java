package core.multithreads.quiz;

/**
 * 1) You have thread T1, T2, and T3. How will you ensure that thread T2 is run
 * after T1 and thread T3 after T2?
 * 
 * @author Development
 *
 */
public class ThreadJoin {
	public void processThread() {
		Runnable r1 = () -> System.out.println("Thread 1");
		Thread t1 = new Thread(r1);
		Runnable r2 = () -> System.out.println("Thread 2");
		Thread t2 = new Thread(r2);
		Runnable r3 = () -> System.out.println("Thread 3");
		Thread t3 = new Thread(r3);

		t1.start();
		try {
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		ThreadJoin j = new ThreadJoin();
		j.processThread();
	}
}
