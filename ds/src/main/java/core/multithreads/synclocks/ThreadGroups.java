package core.multithreads.synclocks;

public class ThreadGroups {
	
	public void runThreadGroup(){
		ThreadGroup g1 = new ThreadGroup("TG");
		
		Thread t1 = new Thread(g1, "t1");
		Thread t2 = new Thread(g1, "t2");
		
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "t3");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		System.out.println("Thread Group Name = "+g1.getName());
		System.out.println("Thread Group Parent Name = "+g1.getParent().getName());
		System.out.println("Thread Group Parent Name = "+g1.getParent().getParent().getName());
		System.out.println();
		g1.list();
	}
	
	public static void main(String args[]){
		ThreadGroups tgs = new ThreadGroups();
		tgs.runThreadGroup();
	}

}
