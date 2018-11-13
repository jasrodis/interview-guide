package jasrodis.interviews.oop.association;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssociationApp {

	private static final Logger log = LoggerFactory.getLogger(AssociationApp.class);

	public static void main(String... args) {

		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Neha");

		log.info("[{}] is employee of [{}]", emp.getEmployeeName(), bank.getBankName());

	}
}