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
		//std.setSubjects(createSubjectsObj());//manual DI
		return std;
	}
	
	
	@Bean
	public Subjects createSubjectsObj() {
		Subjects subj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();//list is interface so we cant create object of it
		subjects_list.add("Java");
		subjects_list.add("Python");
		subjects_list.add("C++");
		
		subj.setSubjects(subjects_list);//since it is in list we have to create the list above
		
		return subj;
	}

}
