package jasrodis.interviews.oop.aggregation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Institute {

	private static final Logger log = LoggerFactory.getLogger(Institute.class);

	private String instituteName;
	private List<Department> departments;

	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}

	// Count total students of all departments in a given institute
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}

}