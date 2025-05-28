package ques.common.compare;

import java.util.Collections;
import java.util.List;

import common.CommonUtils;
import common.dto.Student;

public class CompareMain {
	CommonUtils cu = new CommonUtils();
	
	
	public void init(){
		
		List<Student> list = cu.loadStudentList();
		print(list);
		
		Collections.sort(list, new ComparatorExp());
		System.out.println("**********************************");
		print(list);
	}
	
	private void print(List<Student> list){
		list.forEach( s -> System.out.println(s.getName()+"  "+s.getAge()));
//		System.out.println(list);
		
	}
	
	
	public static void main(String args[]){
		CompareMain cm = new CompareMain();
		cm.init();
	}
	
}

