package jasrodis.interviews.overloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdderApp {

	private static final Logger log = LoggerFactory.getLogger(AdderApp.class);

	public static void main(String... args) {

		Adder adder = new Adder();
		log.info("The adder is : [{}]", adder.add(11, 11));
		log.info("The adder is : [{}]", adder.add(12.3, 12.6));
	}

}
