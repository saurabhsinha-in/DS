package core.multithreads.synclocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {

	public static void main(String args[]){
		TryLockDisplay tld = new TryLockDisplay();
		Runnable r1 = () -> {tld.show("X");};
		Runnable r2 = () -> {tld.show("Y");};
		Runnable r3 = () -> {tld.show("Z");};
		Runnable r4 = () -> {tld.show("A");};
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		Thread t3 = new Thread(r3);
		t3.start();
		try{
			Thread.sleep(4000);
		}catch(Exception ec){}
		Thread t4 = new Thread(r4);
		t4.start();
	}
}
class TryLockDisplay{
	ReentrantLock rl = new ReentrantLock();
	public void show(String name){
//		if(rl.tryLock()){
		try{
			if(rl.tryLock(3000,TimeUnit.MILLISECONDS)){	//This will wait for specified of time to acquire the thread
			System.out.println("Thread "+name+" get the lock");
				Thread.sleep(2000);
			rl.unlock();
		}else{
			System.out.println("Thread "+name+" didn't get the lock, so doing alternative operation");
		}
		}catch(Exception ec){}
	}
}
