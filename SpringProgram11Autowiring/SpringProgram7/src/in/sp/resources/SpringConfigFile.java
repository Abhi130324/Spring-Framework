package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration//for java 
public class SpringConfigFile {

	@Bean//bean is used to create object
	public Address createAddObj() {//this method will help for DI
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Mumbai");
		addr.setPincode(446);
		
		return addr;//this will return the value
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setRollno(101);
		std.setName("Abhijeet");
		std.setAddress(createAddObj());//this will inject the dependency by using the setter method
		
		return std;
	}

}
	
