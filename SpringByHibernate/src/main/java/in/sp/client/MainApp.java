package in.sp.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.config.HibernateConfig;
import in.sp.dao.BookDao;
import in.sp.model.Book;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

		BookDao dao = (BookDao) context.getBean("BookDao");
		
		//insert data
//		dao.addBook(new Book(2, "firstin java"));
//		dao.addBook(new Book(3, "Head First Java"));
//		dao.addBook(new Book(4, "Complete Ref"));
//		dao.addBook(new Book(5, "Thinking Java"));
		
		 // Fetch all books and print their details
//        List<Book> booklist = dao.getAllBooks();
//        for (Book b : booklist) {
//            System.out.println(b);
//        }
        
     // Fetch all book titles and print them
        List<String> titles = dao.getTitles();
        for (String t : titles) {
            System.out.println(t);
        }
        
        
        

	}
}
