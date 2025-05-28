package core.multithreads.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * In this we have list of line to be printed in a specific sequence. Each thread can pick up specified line only.
 * ex. 5 threads are there.
 * Line 1 is taken by T1 line 6 is taken by T1
 * @author Saurabh
 *
 */
public class ThreadSeqProb {
	String lines[] = {"1","2","3","4","5","6","7","8","9","10"};
	
	int totalThread = 5;
	
	
	public void process(){
		ExecutorService ex = Executors.newFixedThreadPool(totalThread);
//		ex.execute();
		int count = 0;
		while(lines.length>count){
			
		}
		
	}
	
	public Integer[] getThreadPosition(int overallPos, int totalThread){
		List<Integer> threadPos = new ArrayList<>();
		for(int i=0;i<totalThread;i++){
			int val = getReadThreadPosition(overallPos);
			threadPos.add(val,overallPos);
			overallPos++;
		}
		return threadPos.toArray(new Integer[]{});
	}
	
	
	private int getReadThreadPosition(int currentPos){
		int val = currentPos;
		if(val>=totalThread){
			val = val % totalThread;				
		}
		return val;
	}
	
	public List<DataReadable> startAllThreadSet(Integer[] lines,String[] content){
		List<DataReadable> dt = new ArrayList<>(lines.length);
		for(Integer line : lines){
			dt.add(new DataReadable(content, line));
		}
		return dt;
		
	}
	
}

class DataReadable implements Callable<String>{

	private String[] lines;
	private int lineIndex;
	
	
	public DataReadable(String[] lines, Integer lineIndex) {
		this.lines = lines;
		this.lineIndex = lineIndex;
	}
	

	@Override
	public String call() throws Exception {
		
		return lines[lineIndex];
	}
}
