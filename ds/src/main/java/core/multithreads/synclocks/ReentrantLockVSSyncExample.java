package core.multithreads.synclocks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockVSSyncExample {

	
	public static void main(String args[]){
		Display d1 = new Display();
		Runnable r1 = () -> { d1.reentrantWish("A");};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () -> { d1.reentrantWish("ZZZ");};
		Thread t2 = new Thread(r2);
		t2.start();
	}
}  





class Display{
	ReentrantLock rt = new ReentrantLock();
	public void reentrantWish(String name){
		rt.lock(); //---------------->1
		System.out.println("**********************Rentrant Loop Process starts**********************");
		for(int i =0; i<10;i++){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(name);
		}
		System.out.println("**********************Rentrant Loop Process Ends**********************");
		System.out.println("\n\n\n\n\n");
		rt.unlock();	//---------------->2
	}
}
