package core.string;

import common.dto.Student;

public class StringPool {

	// private static final Logger logger =
	// LoggerFactory.getLogger(StringPool.class);

	public void strAlloc() {
		/** String assignments via the literals */
		String s1 = "Hi";
		/** String assignments via the literals */
		String s2 = "Hi";
		/**
		 * Single object get created for value "Hi" the same reference is being
		 * used.
		 */
		print("1", s1, s2);
		/**
		 * If the value is created by constructor in that neprint("1",s1,s2);w
		 * object get created
		 */
		String s3 = new String("Hi");
		Student s=new Student();
	System.out.println(s);
		
		print("2", s1, s3);

		String s4 = new String("Hi");
		/**
		 * Value initialized by constructor would acquire different -2 object
		 */
		print("3", s4, s3);

		String s5 = s4;
		print("4", s4, s5);
	}

	public static void main(String args[]) {
		StringPool strPool = new StringPool();
		strPool.strAlloc();
	}

	private void print(String message, String obj1, String obj2) {
		System.out.println("#####################");
		System.out.println("Step " + message + " -->" + (obj1 == obj2));
		System.out.println(obj1 + "=" + obj1.hashCode() + " toStringVal = " + obj1.toString());
		System.out.println(obj2 + "=" + obj2.hashCode() + " toStringVal = " + obj2.toString());
		System.out.println("#####################\n\n");
	}
}
