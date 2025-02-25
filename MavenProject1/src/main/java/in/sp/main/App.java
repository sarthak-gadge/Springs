package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Book;
import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		Book bk = (Book) context.getBean("book", 101, "c++");
		bk.display();

	}
}
