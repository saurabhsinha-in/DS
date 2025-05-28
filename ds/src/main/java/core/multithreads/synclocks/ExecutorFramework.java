package core.multithreads.synclocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
	public static void main(String[] args) {
		PrintJob[] jobs ={ new PrintJob("Ajay"),
				new PrintJob("X"),
				new PrintJob("Y"),
				new PrintJob("Z"),
				new PrintJob("A"),
				new PrintJob("B")};
ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job:jobs){
		service.submit(job);
		}
		service.shutdown();
	}}

class PrintJob1{
	String name;
	public PrintJob1(String name) {
		this.name = name;
		
		Runnable r = () -> {
			System.out.println("Name:"+name+" STARTED BY Thread: "+Thread.currentThread().getName());
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){}
			System.out.println("Name:"+name+" END BY Thread: "+Thread.currentThread().getName());
		};
		Thread t22 = new Thread(r);
		t22.start();
	}
	
	
}

class PrintJob implements Runnable{
	
	String name;
	public PrintJob(String name) {
		this.name = name;
	}
	public void run(){
		System.out.println("Name:"+name+" STARTED BY Thread: "+Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ex){}
		System.out.println("Name:"+name+" END BY Thread: "+Thread.currentThread().getName());
	}
}
