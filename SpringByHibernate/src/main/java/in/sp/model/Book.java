package in.sp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "springhib_books")
public class Book {

	@Id
	@Column(name = "code")
	private int bookId;

	@Column(name = "title", length = 20)
	private String title;

	public Book() {
		super();
	}

	public Book(int bookId, String title) {
		super();
		this.bookId = bookId;
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}

}
