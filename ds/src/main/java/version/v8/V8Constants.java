package version.v8;

import java.util.LinkedHashMap;
import java.util.Map;

public class V8Constants {
	private static Map<String,String> propVal = new LinkedHashMap<>();
	public static Map<String,String> mainPageMap = new LinkedHashMap<>();
	public static Map<String, String> getPropVal() {
		return propVal;
	}
	public static void setPropVal(Map<String, String> propVal) {
		V8Constants.propVal = propVal;
	}
	
	
	
}
