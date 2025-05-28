package core.multithreads.latch.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch -> In this we initialize with a counter when thread get processed to that number of times it stops execution
 * await is used to stop the thread
 * 
 * Development
 *
 */
public class CountDownLatchExample {

	public void processLatch() {
		CountDownLatch latch = new CountDownLatch(3);
		Runnable decrementer = ()->{
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
					latch.countDown();
					System.out.println("decrement="+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable waiter= ()->{
			System.out.print(" Wait Check ");
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiter Released");
			for(int i=0;i<50;i++) {
				System.out.println(" "+i+" ");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(decrementer);
		Thread t2 = new Thread(waiter);
		t1.start();
		t2.start();
		
	}
	
	
	public void processLatch3Threads() {
		CountDownLatch c1 = new CountDownLatch(3);
		Runnable r1 = ()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				c1.countDown();
				System.out.println("Thread 1:");
		};
		Runnable r2 = ()->{
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c1.countDown();
			System.out.println("Thread 2:");
		};
		Runnable r3 = ()->{
			c1.countDown();
			System.out.println("Thread 3:");
		};
		ThreadGroup grp = new ThreadGroup("tGrp");
		Thread t1 = new Thread(grp,r1);
		Thread t2 = new Thread(grp,r2);
		Thread t3 = new Thread(grp,r3);
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			c1.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All Executed");
		
		
	}
	public static void main(String args[]) {
		CountDownLatchExample ce = new CountDownLatchExample();
//		ce.processLatch();
		ce.processLatch3Threads();
	}
	
}
