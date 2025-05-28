package version.v8;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utils {
	
	private static Scanner sc;

	/**
	 * This will load all the property value exists in the msg.properties
	 * It is loading all the properties file into a static map.
	 */
	private void loadProperties(){
		Properties prop = new Properties();
		InputStream input = null;
		Map<String,String> map = new LinkedHashMap<String, String>();
		try{
			input = Utils.class.getClassLoader().getResourceAsStream("msg.properties");
			System.out.println("Loading the properties files::::"+Utils.class.getClassLoader().getResourceAsStream("msg.properties"));
			prop.load(input);
			Enumeration val = prop.keys();
			String key;
			while(val.hasMoreElements()){
				key = ""+val.nextElement();
				System.out.println(key);
				map.put(key, prop.getProperty(key));
			}
			V8Constants.setPropVal(map);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void loadContent(){
		try{
		loadProperties();		
		loadMainChanges();
		load();
		}finally{
			sc.close();
		}
		
	}
	
	private void load(){
		String val;
		do{
			val = userInput();
			clear();
			loadC(val);
			
		}while(!val.equals("0"));
	}
	
	private void clear(){
		try{
//			Runtime.getRuntime().exec("clear");
//			System.clearProperty("write");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	private void loadC(String val){
		switch(val){
		
		case "1":
			loadMainChanges();
			break;
			
		case "0":
			System.exit(0);
			break;
			
		default:
			loadSubElements(val);
			break;
		
		}
	}
	
	
	private List<String> loadSubElements(String val){
		Map<String,String> map = V8Constants.getPropVal();
		List<String> str = map.keySet().stream()
		.filter(string->string.endsWith("."+val))
		.collect(Collectors.toList());
		System.out.println(str);
		return str;
	}
	
	
	
	
	/**
	 * This will load all the properties for the main page.
	 *
	 */	
	private void loadMainChanges(){
		Map<String,String> map = V8Constants.getPropVal();
		List<String> list = map.keySet().stream()
				.filter(string ->string.startsWith("main."))
				.collect(Collectors.toList());		
		displayList(list);
		
	}
	
	
	
	
	private String userInput(){
		 sc=new Scanner(System.in);  	     
		 System.out.println("Please enter input==");
		 String input = sc.next();
		 
		 return input;
	}
	
	/**
	 * This will display all the List of elements to be passed.
	 * @param list
	 */
	private void displayList(List<String> list){
		Map<String,String> map = V8Constants.getPropVal();
		list.forEach(
				item -> System.out.println(map.get(item))
				);
	}
	
	
	
}
