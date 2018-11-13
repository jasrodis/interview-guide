package jasrodis.interviews.oop.overloading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adder {

	private static final Logger log = LoggerFactory.getLogger(Adder.class);

	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

}
