package version.v8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import common.CommonUtils;
import common.dto.Student;

public class StreamUtils {

	public List<String> generateStream(){
		return removeBlankString(new String[]{"abc", "", "bc", "efg", "abcd","", "jkl"});
	}
	
	/**
	 * This will remove the blank String from an Array.
	 * @param arr
	 * @return
	 */
	public List<String> removeBlankString(String arr[]){
		List<String> strs = Arrays.asList(arr);
		System.out.println("Orig List ->"+strs.toString());
		//This is to filter out the content which is having empty string
		List<String> filtered = strs.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
//		System.out.println("Filter List ->"+filtered);		
		return filtered;
	}
	
	
	public List<String> searchString(String arr[], String searchString){
		List<String> actualCollection = Arrays.asList(arr);
		List<String> expectedCollection = actualCollection.stream().filter(string -> string.contains(searchString) ).collect(Collectors.toList());
		return expectedCollection;
	}
	
	public void printRandomNumber(int num){
		Random ram= new Random();
		ram.ints(num).forEach(System.out::println);		
		List<String> strs = generateStream();
		List<String> filtered = strs.stream().limit(2).collect(Collectors.toList());
		System.out.println("Filter List ->"+filtered);
	}
	
	
	/**
	 * This is to print the age of all student by passing the name.
	 * @param sName
	 */
	public void printStudentAge(String sName){
		CommonUtils cu = new CommonUtils();
		List<Student> list = cu.loadStudentList();
		 (list.stream().filter(s -> sName.equals(s.getName())).collect(Collectors.toList()))
		 .forEach(s -> System.out.println(s.getName()+"  "+s.getAge()));
			
	}
	
	
	public static void main(String args[]){
		StreamUtils su = new StreamUtils();
		su.printStudentAge("P");
	}
	
}
