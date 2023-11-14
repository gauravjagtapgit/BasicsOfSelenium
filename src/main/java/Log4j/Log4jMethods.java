package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jMethods {

	private static final Logger logger = LogManager.getLogger(Log4jMethods.class);
	
	public static void main(String[] args) {
		System.out.println("my first log4j");
		
	logger.trace("This is trace message");	
	logger.info("This is information message");
	logger.warn("This is warning message");
	logger.error("This is an error message");
	logger.debug("This is debug message");
	
	System.out.println("This is end Things");
	}
}
