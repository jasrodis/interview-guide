package jasrodis.interviews.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bmw extends Car {

	private static final Logger log = LoggerFactory.getLogger(Bmw.class);

	@Override
	public void run() {
		log.info("This is a car!");
	}

}
