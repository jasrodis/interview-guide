package jasrodis.interviews.oop.aggregation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {

	private static final Logger log = LoggerFactory.getLogger(Student.class);

	private String name;
	private int id;
	private String dept;

	Student(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}