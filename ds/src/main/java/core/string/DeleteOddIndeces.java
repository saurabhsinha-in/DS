package core.string;

public class DeleteOddIndeces {
	public static void main(String args[]){
		DeleteOddIndeces del = new DeleteOddIndeces();
		del.getEvenIndeces("TEE");
	}
	
	public String getEvenIndeces(String str){
		String val[] = str.split("");
		int count=0;
		int evenNum=0;
		StringBuilder sb = new StringBuilder();
		while(val.length>=evenNum){
			sb.append(val[evenNum]);
			count++;
			evenNum = count *2;
		}
		
		System.out.println(val);
		return sb.toString();
	}
	
}
