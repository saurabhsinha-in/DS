package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Quiz7 {
	
	private List<Person> test(Map<String,Person> map1, Map<String,Person> map2){
		
		
		return  map1.values().stream().map(x->{
			Person p = map2.get(x.getAadhar());
			p.setFirst(x.getFirst());
			return p;
		}).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Map<String,Person> map1 = new HashMap<>();//pan
		Map<String,Person> map2 = new HashMap<>();//adhar
		map1.put("1234", new Person("1234","ABC","Saurabh",""));
		map2.put("ABC", new Person("1234","ABC","","Sinha"));
		Quiz7 w = new Quiz7();
		
		w.test(map1, map2).forEach(x -> {System.out.println(x.toString());});
		Set s = new HashSet<>();
		List list = new ArrayList<>();
		

	}

}

class Person{
	
	
	@Override
	public String toString() {
		return "Person [pan=" + pan + ", aadhar=" + aadhar + ", first=" + first + ", last=" + last + "]";
	}
	public Person(String pan, String aadhar, String first, String last) {
		super();
		this.pan = pan;
		this.aadhar = aadhar;
		this.first = first;
		this.last = last;
	}
	private String pan;
	private String aadhar;
	private String first;
	private String last;
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	
}
