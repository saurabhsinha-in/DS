package core.multithreads.latch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class CyclicBarrierExample{
	AtomicInteger count = new AtomicInteger(0);
	public void processCb(){
		System.out.println("Test Starts");
		
		Runnable r = ()->{
			System.out.println("Thread Main: "+count);
			
		};
		CyclicBarrier cb = new CyclicBarrier(3, r);
		
		Runnable r1 = ()->{
			
			
				try {
					
					System.out.println("Thread Before 1: "+count.incrementAndGet());
					Thread.sleep(9000);
					cb.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 1: "+cb.getNumberWaiting());
		};
		Runnable r2 = ()->{
			
			try {
				System.out.println("Thread Before 2: "+count.incrementAndGet());
				Thread.sleep(4000);
				cb.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2: "+cb.getNumberWaiting()+" "+count.incrementAndGet());
		};
		Runnable r3 = ()->{
			try {
				System.out.println("Thread Before 3: "+count.incrementAndGet());
				cb.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 3: "+cb.getNumberWaiting());
		};
//		(Arrays.asList(new Runnable[] {r1,r2,r3})).stream().forEach(run-> new Thread(run).start() );
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	public static void main(String arg[]) {
		CyclicBarrierExample cbe = new CyclicBarrierExample();
		cbe.processCb();
	}
}
