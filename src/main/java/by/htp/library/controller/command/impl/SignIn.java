package by.htp.library.controller.command.impl;

import by.htp.library.controller.command.Command;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;
import by.htp.library.service.factory.ServiceFactory;

public class SignIn implements Command {

	@Override
	public String executeCommand(String request) {
		String [] parameter = request.split(" ");
		String login = parameter[1];
		String password = parameter[2];
		
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		String response = null;
		
		try {
			userService.signIn(login, password);
			response = "Welcome " + login;
		} catch (ServiceException e) { 
			response = "Sign in error";
			//logger.log(Level.ERROR, e);
		}
		
		return response;
	}

}
