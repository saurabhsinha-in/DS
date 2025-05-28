package core.multithreads.latch.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 3 Employee are leaving from office. Driver can start only when all 3 emp came
 * into the car and take seat
 * 
 * @author Development
 *
 */

public class CDLQuiz1 {

	CountDownLatch latch = new CountDownLatch(4);

	public void execute() {

		Thread t = new Thread(new EmpSeat("Saurabh", 1000, latch));
		Thread t1 = new Thread(new EmpSeat("Abhesh", 2000, latch));
		Thread t2 = new Thread(new EmpSeat("Vaibhav", 3000, latch));
		Thread t3 = new Thread(new EmpSeat("Dheerendra", 3000, latch));
		Thread driver = new Thread(new Driver(latch));
		driver.start();
		t1.start();
		t2.start();
		t3.start();
		t.start();
	}

	class Driver implements Runnable {

		CountDownLatch latch;

		public Driver(CountDownLatch latch) {
			super();
			this.latch = latch;
		}

		@Override
		public void run() {
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Driver Started");
		}

	}

	class EmpSeat implements Runnable {
		String empName;
		int waitTime;
		CountDownLatch latch;

		public EmpSeat(String empName, int waitTime, CountDownLatch latch) {
			super();
			this.empName = empName;
			this.waitTime = waitTime;
			this.latch = latch;
		}

		@Override
		public void run() {
			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(empName + " take the seat");
			latch.countDown();
		}

	}

	class Emp {
		String empName;
		int waitTime;
		CountDownLatch latch;

		public Emp(String empName, int waitTime, CountDownLatch latch) {
			super();
			this.empName = empName;
			this.waitTime = waitTime;
			this.latch = latch;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public int getWaitTime() {
			return waitTime;
		}

		public void setWaitTime(int waitTime) {
			this.waitTime = waitTime;
		}

		public CountDownLatch getLatch() {
			return latch;
		}

		public void setLatch(CountDownLatch latch) {
			this.latch = latch;
		}

	}

	public static void main(String[] arg) {
		CDLQuiz1 c = new CDLQuiz1();
		c.execute();
	}
}
