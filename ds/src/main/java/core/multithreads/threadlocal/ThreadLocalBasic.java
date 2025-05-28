package core.multithreads.threadlocal;

public class ThreadLocalBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocalBasic tlb = new ThreadLocalBasic();
		tlb.process();

	}
	
	public void process(){
		ThreadLocal<String> tl = new ThreadLocal<String>(){
			public String initialValue(){
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Sau");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
