package core.multithreads.synclocks;

public class SyncExample {

	
	public static void main(String args[]){
		
//		MyThread3 t1 = new MyThread3(new Display3(), "B");
//		MyThread3 t2 = new MyThread3(new Display3(), "WWW");
//		t1.start();
//		t2.start();
//		
		Display3 dr = new Display3();
		Runnable r7 = () -> {(dr).syncWish("P");};
		Thread t7 = new Thread(r7);
		t7.start();
		
		Runnable r8 = () -> {(dr).syncWish("QQQ");};
		Thread t8 = new Thread(r8);
		t8.start();
		
	}
	
	
	
}  




class Display3{

	public synchronized void syncWish(String name){
		System.out.println("**********************Synchronized Loop Process starts**********************");
		for(int i =0; i<10;i++){
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(name + " ");
		}
		System.out.println("**********************Synchronized Loop Process Ends**********************");
		System.out.println("\n\n\n\n\n");
	}
	
	
}
