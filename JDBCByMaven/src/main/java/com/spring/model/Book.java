package com.spring.model;

public class Book {

	private int BookId;
	private String title;

	public Book() {
		super();
	}

	public Book(int bookId, String title) {
		super();
		this.BookId = bookId;
		this.title = title;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		this.BookId = BookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + BookId + ", title=" + title + "]";
	}

}
