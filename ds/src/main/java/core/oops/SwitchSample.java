package core.oops;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SwitchSample {

	
	
	public static void main(String[] args) {
		SwitchSample s = new SwitchSample();
		s.a();
	}
	
	public void a(){
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		
		Iterator<String> it = l.iterator();
		l.remove("B");
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	
}

class W{
	String day;
	W(String d){day=d;}
	public boolean equals(Object o){
		return ((W)o).day == this.day;
	}
}

