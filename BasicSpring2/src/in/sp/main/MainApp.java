package in.sp.main; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;



public class MainApp {
	
	public static void main(String[] args) {
		
		String configLocation = "in/sp/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Employee emp = (Employee) context.getBean("empId");
		emp.display();
	}

}
