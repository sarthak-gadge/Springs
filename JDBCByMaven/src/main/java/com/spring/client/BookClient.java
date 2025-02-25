package com.spring.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.BookConfig;
import com.spring.dao.BookDao;
import com.spring.model.Book;

public class BookClient {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);

		BookDao dao = (BookDao) context.getBean("bookDao");

//		1.Insert Data
//		dao.addBook(new Book(103, "spring"));
//		System.out.println("Data inserted successfully !!!!");

//		 2. update Book title
		 dao.updateBook(101,"mansoon");
		 System.out.println("Data updated successfully !!!!");

		// 3. delete book
		// dao.deleteBook(105);

		// 4. show all books
//	List<Book> lst = dao.getAllBooks();
//	for (Book book : lst) {
//		System.out.println(book);
//	}

		// 5. show book details by ID

		        Book book = dao.getBook(102);
		        System.out.println(book);

		// 6. show all book title

//		        String title = dao.getBookTitle(103);
//		        System.out.println(title);

		// 7. show book title by ID
//		    	List<String> bookTitles = dao.getAllBookTitles(); // Call a new method that returns only titles
//		    	for (String title : bookTitles) {
//		    	    System.out.println(title);
//		    	}
	}

}
