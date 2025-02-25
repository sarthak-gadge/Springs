package com.spring.dao;

import java.util.List;

import com.spring.model.Book;

public interface BookDao {
	
	public int addBook(Book book);//insert.
	
	public int updateBook(int bookId, String newTitle);// 2. update Book title

	public int deleteBook(int bookId);// 3. delete book

	public List<Book> getAllBooks();// 4. show all books

	public Book getBook(int bookId);// 5. show book details by ID

	public List<String> getAllBookTitles();// 6. show all book title

	public String getBookTitle(int bookId);// 7. show book title by ID
}


