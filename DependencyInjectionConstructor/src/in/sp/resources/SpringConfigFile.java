package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj() {

		Address addr = new Address("Bhopal", "MP");
		return addr;
	}
	
	@Bean
	public Student createStudObj() {
 		Student Stud = new Student(102,"Ravi",createAddrObj()); //manual dependency injection
		return Stud;
		
	}
	
	

}
