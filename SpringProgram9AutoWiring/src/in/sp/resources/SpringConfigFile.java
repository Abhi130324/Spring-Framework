package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Mumbai");
		addr.setPincode(12135);
		
		
		return addr;
	}
	
	@Bean
	public Student createStudentObj() {
		
		Student std = new Student();
		std.setName("Rishil");
		std.setRollno(121);
		//std.setAddress(createAddressObj());//since we are doing dependency manually
		
		return std;
	}

}
