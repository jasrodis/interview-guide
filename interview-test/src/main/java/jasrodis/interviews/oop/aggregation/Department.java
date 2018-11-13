package jasrodis.interviews.oop.aggregation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Department {

	private static final Logger log = LoggerFactory.getLogger(Department.class);

	private String name;
	private List<Student> students;

	Department(String name, List<Student> students) {

		this.name = name;
		this.students = students;

	}

	public List<Student> getStudents() {
		return students;
	}
}