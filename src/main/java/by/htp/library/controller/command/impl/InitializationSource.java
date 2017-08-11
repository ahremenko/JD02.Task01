package by.htp.library.controller.command.impl;

import by.htp.library.controller.command.Command;
import by.htp.library.service.InitializationService;
import by.htp.library.service.exception.ServiceException;
import by.htp.library.service.factory.ServiceFactory;

public class InitializationSource implements Command {

	@Override
	public String executeCommand(String request) {
		ServiceFactory factory = ServiceFactory.getInstance();
		InitializationService initializationService = factory.getInitializationService();
		String response = null;
		
		try {
			initializationService.initialization();
			response = "Database has been initialized";
		} catch (ServiceException e) {
			response = "Database has not been initialized";
//			LOGGER.error(e);	
		}
		
		return response;
	}

}
