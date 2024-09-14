package homework_10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer {
	private static  final  Logger LOGGER = LogManager.getLogger();
	
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Customer() {
		
	}
	public void print(String text) {
		
		LOGGER.info("print : " + text);
	}
	

}
