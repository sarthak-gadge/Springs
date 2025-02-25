package in.sp.dao;

import java.util.List;

import in.sp.model.Book;

public interface BookDao {

	public void addBook(Book book);// Add a new book.

	public List<Book> getAllBooks();  // Get all books
	
	 public List<String> getTitles();  // Get all book titles
	

}
