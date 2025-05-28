package version.v8.defaults.methods;

public interface Vehicle {

	default void print(){
		System.out.println("I am a Vehicle.");
	}
}
