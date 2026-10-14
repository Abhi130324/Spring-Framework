package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj1() {
		
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Mumbai");
		addr.setPincode(12135);
		
		
		return addr;
	}
	
	@Bean
	public Address createAddressObj2() {
		
		Address addr = new Address();
		addr.setHouseno(101);
		addr.setCity("Pune");
		addr.setPincode(154635);
		
		
		return addr;
	}
	
	
	
	@Bean
	public Student createStudentObj() {
		
		Student std = new Student();
		std.setName("Rishil");
		std.setRollno(121);
		//std.setAddress(createAddressObj());//since we are doing dependency manually
		//std.setSubjects(createSubjectsObj());//manual DI
		return std;
	}
	
	
	

}
