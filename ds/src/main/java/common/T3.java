package common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T3 {

	public static void main(String[] args) {
		try{
			T3 ba = new T3();
			Map<Integer,Set<Integer>> map = ba.a();
		}catch(Exception ex){
			ex.printStackTrace();
		}
				
	}
	
	
	private Map<Integer,Set<Integer>> a(){
		Map<Integer,Set<Integer>> map = new HashMap<>();
		Set<Integer> sa = new HashSet<>();
		
//		sa.iterator().
		sa.add(3);
		sa.add(2);
		map.put(1,sa);
		
		 sa = new HashSet<>();
			sa.add(1);
			sa.add(4);
			map.put(2,sa);	
			
			 sa = new HashSet<>();
				sa.add(1);
				sa.add(4);
				map.put(3,sa);
				
				 sa = new HashSet<>();
					sa.add(2);
					sa.add(3);
					sa.add(5);
					map.put(4,sa);
					
					 sa = new HashSet<>();
						sa.add(4);
						
						map.put(5,sa);
		
		
	return map;	
	}
	


}
