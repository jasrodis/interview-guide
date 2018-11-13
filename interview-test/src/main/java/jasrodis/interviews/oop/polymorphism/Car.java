package jasrodis.interviews.oop.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {

	private static final Logger log = LoggerFactory.getLogger(Car.class);

	public void run() {
		log.info("This is a car!");
	}

}
