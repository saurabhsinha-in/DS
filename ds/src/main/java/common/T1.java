package common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class T1 {

	public static void main(String[] args) {
		
//		List<BigInteger> s = a();
// 		
//		Collections.sort(s,new T2());
//		
//		System.out.println(s);
//		
//		for(BigInteger sa : s){
//			System.out.println(sa);
//		}
		
		
		System.out.println(0.0%0.0!=0.0/0.0);
		
	}
	
	public static List<BigInteger> a(){
		String[] str ={
				"31415926535897932384626433832795",
"1",
"3",
"10",
"3",
"5"
		};
		
		List<BigInteger> BI = new ArrayList<>();	 
		
		
		for(String s: str){
			BI.add(new BigInteger(s));
		}
		
			
		
		return BI;
	}
	

}
