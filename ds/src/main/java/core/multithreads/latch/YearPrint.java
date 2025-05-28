package core.multithreads.latch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YearPrint {
	
	public static ConcurrentMap<Integer,String> cm = new ConcurrentHashMap<>();
	public static long startTime =0;
	public static long endTime = 0;
	public static void main(String args[]) {
		try {
			LineNumberReader lineNumberReader = 
				    new LineNumberReader(new FileReader("c:\\data\\input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Entered Main");
		startTime = System.currentTimeMillis();
		String lines[] = { "A", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J10","A", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J10","A", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J10","A", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J10","A", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J10" };
		CyclicBarrier cb = new CyclicBarrier(lines.length, new Aggregator());
		 ExecutorService es = Executors.newCachedThreadPool();
		List<WorkerThread> list = new ArrayList<>();
		for (int i=0;i<lines.length;i++) {
			list.add(new WorkerThread(cb, lines[i],i));
		}
		 for(WorkerThread line :list){
			 es.submit(line);
		 }
		 es.shutdown();
	}
	public static void snooze() {
		try {
			Thread.sleep(0000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Aggregator extends Thread {

	@Override
	public void run() {
//		for(){
			System.out.println(YearPrint.cm);
//		}
		System.out.println("Inside Aggregator");
		YearPrint.endTime = System.currentTimeMillis();
		System.out.println(YearPrint.endTime - YearPrint.startTime);
	}
}

class WorkerThread extends Thread {

	CyclicBarrier syncBarrier;
//	ReentrantLock rc = new ReentrantLock();
	private Integer lineNo;

	public WorkerThread(CyclicBarrier cb, String name, int lineNo) {
		this.setName(name);
		this.syncBarrier = cb;
//		this.start();
		this.lineNo = lineNo;

	}

	@Override
	public void run() {
		ConcurrentMap map = new ConcurrentHashMap<>();

		try {
			System.out.println(this.getId());
			YearPrint.cm.putIfAbsent(lineNo, getName());
			syncBarrier.await();

//		} catch (InterruptedException | BrokenBarrierException e) {
		}catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
