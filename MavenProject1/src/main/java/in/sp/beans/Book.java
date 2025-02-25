package in.sp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("book")
@Scope("prototype")
public class Book {

	private int bookId;
	private String bookName;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void display() {
		System.out.println("BOOK ID: "+bookId);
		System.out.println("BOOK NAME: "+bookName);
	}

}
