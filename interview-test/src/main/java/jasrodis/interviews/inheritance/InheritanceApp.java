package jasrodis.interviews.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InheritanceApp {

	private static final Logger log = LoggerFactory.getLogger(InheritanceApp.class);

	public static void main(String... args) {
		Car bentley = new Bentley();
		log.info("The brand is : [{}]", bentley.getBrand());
	}

}
