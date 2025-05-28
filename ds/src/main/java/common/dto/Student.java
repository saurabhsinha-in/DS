package common.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public  class Student {
	
	
	private String name;	
	private String address;
	private int age;
	
	public Student(){
		
	}

	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}


	
	

	
}
