package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Quiz5 {
	public static void main(String args[]){
		Quiz5 q5 = new Quiz5();
		q5.getQuiz7();
	}
	
	public void getQuiz5(){
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String sa = scan.nextLine();
		List<Integer> val = Arrays.asList(sa.split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		Collections.sort(val);
		int max = val.get(val.size()-1);
		int min = val.get(0);
		
		System.out.println(max-min);
	}
	
	public void getQuiz6(){
		Scanner scan = new Scanner(System.in);
		Integer s = scan.nextInt();
		char a = 'A';
		char b = a;
		
		if(s>0 && s<27){
			for(int i=0;i<s;i++){
				for(int j=0;j<5;j++){
					System.out.print(b++);
					if(j!=4){
					System.out.print(" ");
					}
				}
				System.out.println();
				b=a;
			}
		}else{
			System.out.println("Please enter number 1-26");
		}
	}
	
	public void getQuiz7(){
		
		Scanner scanner = new Scanner(System.in);
    	int num = scanner.nextInt();
    	Quiz2 q2 = new Quiz2();
    	if(q2.isNumber(num)){
    	    for(int i=num;i > 0;i--){
    	    	for(int j=1;j<=5;j++){
    	    		System.out.print(i);
    	    		if(j!=5){
    	    		System.out.print(" ");
    	    		}
    	    	}
    	        System.out.println();
    	    }
    	}
	}
	
}
