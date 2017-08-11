package by.htp.library.dao.factory;

import by.htp.library.dao.BookDAO;
import by.htp.library.dao.InitializationDAO;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.impl.BookDAOImpl;
import by.htp.library.dao.impl.InitializationDAOImpl;
import by.htp.library.dao.impl.UserDAOImpl;

public final class DAOFactory {
	private static DAOFactory instance = null;
	private final UserDAO userDAO = new UserDAOImpl();
	private final BookDAO bookDAO = new BookDAOImpl();
	private final InitializationDAO initializationDAO = new InitializationDAOImpl();
	
	private DAOFactory() {}

	public static DAOFactory getInstance() {
		if(instance == null){
			instance = new DAOFactory();
		}
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public InitializationDAO getInitializationDAO() {
		return initializationDAO;
	}
	
}
