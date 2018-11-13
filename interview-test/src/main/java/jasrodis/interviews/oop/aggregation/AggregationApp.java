package jasrodis.interviews.oop.aggregation;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AggregationApp {

	private static final Logger log = LoggerFactory.getLogger(AggregationApp.class);

	public static void main(String... args) {

		// We have four students
		Student s1 = new Student("Mia", 1, "CSE");
		Student s2 = new Student("Priya", 2, "CSE");
		Student s3 = new Student("John", 1, "EE");
		Student s4 = new Student("Rahul", 2, "EE");

		// And the list of the two first
		List<Student> cseStudents = new ArrayList<>();
		cseStudents.add(s1);
		cseStudents.add(s2);

		// The list of the two last
		List<Student> eeStudents = new ArrayList<>();
		eeStudents.add(s3);
		eeStudents.add(s4);

		Department cse = new Department("CSE", cseStudents);
		Department ee = new Department("EE", eeStudents);

		List<Department> departments = new ArrayList<>();
		departments.add(cse);
		departments.add(ee);

		// creating an instance of Institute.
		Institute institute = new Institute("BITS", departments);

		log.info("Total students in institute: [{}]", institute.getTotalStudentsInInstitute());

	}

}
