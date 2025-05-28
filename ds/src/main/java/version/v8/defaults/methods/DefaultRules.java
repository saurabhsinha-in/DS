package version.v8.defaults.methods;

interface Interface1{
	void method1();
	
	default void log(String str){
		System.out.println("Test1");
	}
}

interface Interface2{
	void method2();
	
	default void log(String str){
		System.out.println("Test2");
	}
}

public class DefaultRules {

}

class D1 implements Interface1{
	@Override
	public void method1() {	
		
	}
	
	
	//We can also overide or use the direct implementation of it
	@Override
	public void log(String str) {
		System.out.println("Test String "+str);
	}
}



//Static
interface MyData{
	default void print(String str) {
		System.out.println(isNull(str));
	}
	static boolean isNull(String str) {
		System.out.println("IN");
		return true;
	}
}

class StaticName implements MyData{
	public static void main(String args[]) {
		StaticName m = new StaticName();
		
	}
}

//class D2 implements Interface1, Interface2{
//	
//}
