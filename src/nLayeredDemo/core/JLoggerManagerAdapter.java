package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements JLoggerService {

	@Override
	public void logToSystem(String message) {

		JLoggerManager manager = new JLoggerManager();
		
		manager.log(message);
		
	}
	
	// burda da newlemek yerine injection yapılabilir

}
