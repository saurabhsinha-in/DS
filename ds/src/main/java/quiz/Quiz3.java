package quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		String str1 = s1.nextLine();
		String str2 = s1.nextLine();
		Integer str3 = s1.nextInt();
		String arr[] = str2.split(" ");
		List<String> initVal = Arrays.asList(arr);
		List<String> output = initVal.stream().filter(n -> str3<Integer.parseInt(n)).collect(Collectors.toList());
		output.stream().forEach(System.out::println);
	}

}
