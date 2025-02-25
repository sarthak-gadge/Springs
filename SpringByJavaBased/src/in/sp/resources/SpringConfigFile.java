package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student studId() {
		
		Student stud = new Student();
		stud.setRollNo(12);
		stud.setName("Sanket");
		
		return stud;
		
	}
	
	

}
