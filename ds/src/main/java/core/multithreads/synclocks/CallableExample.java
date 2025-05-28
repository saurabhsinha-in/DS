package core.multithreads.synclocks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) {
		CallThread[] jobs = {
				new CallThread(5), new CallThread(10),
				new CallThread(20), new CallThread(30),
				new CallThread(40), new CallThread(50)};
	ExecutorService es = Executors.newFixedThreadPool(4);
	try{
		Future<String> f;
	for(CallThread job : jobs){
		f = es.submit(job);
		System.out.println(f.get());
	}
es.shutdown();
	}catch(Exception ex){}
}}

class CallThread implements Callable<String>{
	int num;
	public CallThread(int num) {
		this.num = num;
	}
	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName()
				+" is responsible to find sum of first "+ num
				+" numbers"
				);
		int sum = 0;
		for(int i =0 ;i<num;i++){
//			System.out.print(sum+" +"+i+"==>");
			sum = sum + i;
//			System.out.println("Sum="+sum);
		}
		return sum+"";
	}
}