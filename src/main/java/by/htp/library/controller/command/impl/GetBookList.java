package by.htp.library.controller.command.impl;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.controller.command.Command;
import by.htp.library.service.BookService;
import by.htp.library.service.exception.ServiceException;
import by.htp.library.service.factory.ServiceFactory;

public class GetBookList implements Command {

	@Override
	public String executeCommand(String request) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		BookService bookService = serviceFactory.getBookService();
		
		List<Book> booklist = null;
		String response = null;
		try {
			booklist = bookService.getBooklist();
			response = "List of books received";
			
			//Circle just for test
			for(Book book: booklist){
				System.out.println(book.toString());
			}
		} catch (ServiceException e) {
			response = "Error getting list of books";
			//logger.log(Level.ERROR, e);
		}
		
		return response;
	}

}
