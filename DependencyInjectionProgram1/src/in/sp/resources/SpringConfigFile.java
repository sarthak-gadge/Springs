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
		addr.setCity("Pune");
		addr.setState("MH");
		return addr;

	}

	@Bean
	public Student createStudObj() {
		Student stud = new Student();
		stud.setRollNo(123);
		stud.setName("Sarthak");
		stud.setAddress(createAddrObj());
		return stud;

	}

}
