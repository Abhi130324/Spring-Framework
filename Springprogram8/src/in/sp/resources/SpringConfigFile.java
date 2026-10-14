package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration//for java 
public class SpringConfigFile {

	@Bean//bean is used to create object
	public Address createAddObj() {//this method will help for Constructor DI
		Address addr = new Address(200,"Gujrat",112);
		
		return addr;//this will return the value
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student(142,"Shailesh",createAddObj());
		
		
		return std;
	}

}
	
