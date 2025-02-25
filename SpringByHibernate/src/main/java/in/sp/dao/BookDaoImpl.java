package in.sp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.sp.model.Book;

@Transactional
@Repository("BookDao")
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	protected Session getSession() {
		
		return sessionFactory.getCurrentSession();
		
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		getSession().save(book);
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
        // Fetch all books using a query from the "Book" entity
        Query q = getSession().createQuery("from Book b");
        return q.list();  // Return the list of books
	}

	@Override
	public List<String> getTitles() {
		// TODO Auto-generated method stub
		// Fetch only the titles of all books using the select clause
        Query q = getSession().createQuery("select b.title from Book b");
        return q.list();  // Return the list of titles
    
	}

	
	
	

	
	
	

	
	
	
	
	
	
	

}
