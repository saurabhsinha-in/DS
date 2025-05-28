package core.multithreads.problems;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.concurrent.Callable;

public class ThreadSeqProb1 {
	public static void main(String args[]){
		
	}
}

class FileReadable implements Callable<String>{
	
	@Override
	public String call() {
		try{
		Reader r = new FileReader("");
		try(LineNumberReader lineReader = new LineNumberReader(r)){
//			lineReader.
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return null;
	}
}
