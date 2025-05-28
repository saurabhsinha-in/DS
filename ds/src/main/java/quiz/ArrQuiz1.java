package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class ArrQuiz1 {
    public static Map<Integer,Integer> totalMap = new HashMap<>();
    public static List<Detail> detailList = new ArrayList<>();
   public static void main(String args[] ) throws Exception {

	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
//	System.out.println(s);
	String sa[] = s.split(" ");
//	System.out.println(sa.length);
	int[] array = Arrays.stream(sa).mapToInt(Integer::parseInt).toArray();
//	System.out.println(array.length);
	ArrQuiz1 a = new ArrQuiz1();
	System.out.println(a.getMajority(array));
   }
   
   
   
   public int getMajority(int arr[]){
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
    	   map = getTotalMap(arr[i]);
       }
       List<Detail> list = new ArrayList<>(map.size());
       Iterator<Integer> sVal = map.keySet().iterator();
       while(sVal.hasNext()){
    	   Integer val = sVal.next();
    	   list.add(new Detail(val, map.get(val)));
       }
       /*for(Detail k : list){
    	   System.out.println(k.getTotalVal());
       }*/
//       Integer[] val1 = map.values().toArray(new Integer[]{});
////       List<Integer> val2
       Collections.sort(list, new ArrComp());
       
       /*for(Detail k : list){
    	   System.out.println(k.getTotalVal());
       }*/
       Detail dp = list.get(list.size()-1);
       int total = dp.getTotalVal();
       int printVal = -1;
       if(total> (list.size()/2)){
    	   printVal = dp.getId();
       }
       
       return printVal;
   }
   
   
   
   private Map<Integer,Integer> getTotalMap(Integer num){
//	   System.out.println("num="+ num);
	   Integer val = totalMap.get(num);
	   if(val == null){
		   val = 1;
	   }
	   totalMap.put(num, val +1);
	   return totalMap;
   }
   
}

class Detail{
	private int id;
	private Integer totalVal;
	
	public Detail(int id, Integer totalVal) {
		super();
		this.id = id;
		this.totalVal = totalVal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getTotalVal() {
		return totalVal;
	}
	public void setTotalVal(Integer totalVal) {
		this.totalVal = totalVal;
	}
	
}

class ArrComp implements Comparator<Detail>{
	@Override
	public int compare(Detail o1, Detail o2) {
		
		return o1.getTotalVal().compareTo(o2.getTotalVal());
	}
}
