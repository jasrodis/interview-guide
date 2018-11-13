package jasrodis.interviews.oop.association;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//class bank 
public class Bank {

	private static final Logger log = LoggerFactory.getLogger(Bank.class);

	private String name;

	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}