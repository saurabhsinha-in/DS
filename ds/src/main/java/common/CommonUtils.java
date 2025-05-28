package common;

import java.util.ArrayList;
import java.util.List;

import common.dto.Student;

public class CommonUtils {

	public List<Student> loadStudentList(){
		List<Student> list = new ArrayList<>();
		list.add(new Student("A", "Sd Delhi", 23));
		list.add(new Student("Z", "Sd Delhi", 49));
		list.add(new Student("P", "Sd Delhi", 94));
		list.add(new Student("B", "Sd Delhi", 32));
		return list;
	}
}
