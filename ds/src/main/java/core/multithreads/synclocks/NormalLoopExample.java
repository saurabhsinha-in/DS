package core.multithreads.synclocks;

public class NormalLoopExample {

	
	public static void main(String args[]){
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread1 t1 = new MyThread1(d1, "Shrivali");
		MyThread1 t2 = new MyThread1(d2, "Shrikirti");
		t1.start();
		t2.start();
		
	}	
}  


class MyThread1 extends Thread{
	Display1 d;
	String name;
	public MyThread1(Display1 d, String name) {
		this.d= d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}


class Display1{
	public void wish(String name){
		System.out.println("**********************Normal Loop Process starts**********************");
		for(int i =0; i<10;i++){
			System.out.print("Good Morning:");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(name+"\n");
		}
		System.out.println("**********************Normal Loop Process Ends**********************");
		System.out.println("\n\n\n\n\n");
	}
	
	
	
	
}
