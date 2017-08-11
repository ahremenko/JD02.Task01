package by.htp.library.service.factory;

import by.htp.library.service.BookService;
import by.htp.library.service.InitializationService;
import by.htp.library.service.UserService;
import by.htp.library.service.impl.BookServiceImpl;
import by.htp.library.service.impl.InitializationServiceImpl;
import by.htp.library.service.impl.UserServiceImpl;

public final class ServiceFactory {
	private static ServiceFactory instance = null;
	private final UserService userService = new UserServiceImpl();
	private final BookService bookService = new BookServiceImpl();
	private final InitializationService initializationService = new InitializationServiceImpl();
	
	private ServiceFactory() {}

	public static ServiceFactory getInstance() {
		if(instance == null){
			instance = new ServiceFactory();
		}
		return instance;
	}

	public UserService getUserService() {
		return userService;
	}

	public BookService getBookService() {
		return bookService;
	}

	public InitializationService getInitializationService() {
		return initializationService;
	}
	
}
