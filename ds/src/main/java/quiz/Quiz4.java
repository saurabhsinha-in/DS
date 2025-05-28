package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		String str1 = s1.nextLine();
		String str2 = s1.nextLine();
		List<Integer> arr = Arrays.asList(str2.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> ar1 = arr;
		Integer val[] = arr.toArray(new Integer[]{});
		Collections.sort(ar1);
		List<Integer> output = new ArrayList<>(arr.size());
		int last = ar1.get(ar1.size()-1);
		boolean flag1 = true;
		boolean flag2 = true;
		int last2 = ar1.get(ar1.size()-2);
		output.add(last);
		output.add(last2);
		for(Integer ip:val){
			
			/*if( !(flag1 || flag2) ){	
				output.add(ip);	
			}*/
			
			if( (last==ip && flag1)){
				flag1= false;
				
			}else if(last2==ip && flag2){
				flag2 = false;
			}else{
				output.add(ip);	
			}
			
			
			
		}
		
		for(int k=0;k<output.size();k++){
			System.out.print(output.get(k));
			if(k<output.size()-1){
			System.out.print(" ");
			}
		}
	}

}
