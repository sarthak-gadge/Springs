package in.sp.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.bean.Address;
import in.sp.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address address1() {
		return new Address("PUNE", "MAHARASHTRA");
	}
	
	@Bean
	public Address address2() {
		return new Address("Mumbai", "MAHARASHTRA");
	}

	@Bean
	public Student student( Address addr) {
		return new Student(101, "Sagar", addr);

	}

}
