package core.multithreads.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueOperations {

	public void initiateBlockingQueue() {
		BlockingQueue<Integer> blockQue = new ArrayBlockingQueue<>(10);

		Runnable prod = () -> {
			for (int i = 0; i < 1000; i++) {
				try {
					blockQue.put(new Integer(i));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Producer :" + i + " Size :" + blockQue.size());
			}
		};
		Runnable cons = () -> {

			
			while (true) {
				try {
					// System.out.println("Consumer :"+blockQue.poll(2,TimeUnit.NANOSECONDS)+"
					// Size:"+blockQue.size());
					System.out.println(
							"blockQue.isEmpty()==" + blockQue.isEmpty() + " blockQue.take()=" + blockQue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
//			System.out.println("Size:" + blockQue.size());
		};
		Thread t = new Thread(prod);
		Thread t1 = new Thread(cons);
		t.start();
		t1.start();
	}

	public static void main(String args[]) {
		BlockingQueueOperations b = new BlockingQueueOperations();
		b.initiateBlockingQueue();
	}

}
