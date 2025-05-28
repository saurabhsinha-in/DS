package common;

import java.math.BigInteger;
import java.util.Comparator;

public class T2 implements Comparator<BigInteger> {

	@Override
	public int compare(BigInteger o1, BigInteger o2) {
		
		return o1.compareTo(o2);
		
	}
	
}
