package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setCity("Mumbai");
		addr.setState("MH");
		return addr;
	}
	
	@Bean
	public Address createAddrObj2() {
		Address addr = new Address();
		addr.setCity("Patna");
		addr.setState("BH");
		return addr;
	}

	
	@Bean
	public Student createstudObj() {
		Student stud = new Student();
		stud.setRollNo(104);
		stud.setName("Laxman");
		return stud;
	}
}
