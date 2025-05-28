package designpattern.singleton;

public class SingletonExample {

	private static SingletonExample stud =null;
	
	private SingletonExample(){
		
	}
	
	public SingletonExample getInstance(){
		
		if(stud == null){
			synchronized (stud) {
				stud = new SingletonExample();
			}
		}
		return stud;
		
	}
	
}
