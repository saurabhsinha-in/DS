package ques.common.compare;

import java.util.Comparator;

import common.dto.Student;

public class ComparatorExp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() == o2.getAge()){
			return 0;
		}else if(o1.getAge()>o2.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
}


