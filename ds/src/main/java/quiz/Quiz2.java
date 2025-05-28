package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write code here
		System.out.println("Please Enter the number");
		Scanner scanner = new Scanner(System.in);
    	int num = scanner.nextInt();
    	Quiz2 q2 = new Quiz2();
    	if(q2.isNumber(num)){
    	    for(int i=0;i < num;i++){
    	    	for(int j=1;j<=5;j++){
    	    		System.out.print(j);
    	    		if(j!=5){
    	    		System.out.print(" ");
    	    		}
    	    	}
    	        System.out.println();
    	    }
    	}
	}
	
	  public boolean isNumber(int val){
	       boolean flag = false;
	       try{
	           
	           if(val>0 && val<=1000){
	               flag = true;
	           }
	       }catch(Exception ex){
	           flag = false;
	       }
	       return flag;
	   }

}
