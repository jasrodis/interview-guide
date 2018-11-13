package jasrodis.interviews.oop.association;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {

	private static final Logger log = LoggerFactory.getLogger(Employee.class);

	private String name;

	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}