package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
    @Bean("stdObj1")
	public Student createStdBeanObj1() {//method for id
		
    	Student std = new Student();
    	
    	std.setName("Shailesh");
    	std.setRollno(104);
    	std.setEmail("shailesh@gmail.com");
    	
    	return std;
	}
//    
    @Bean("stdObj2")
	public Student createStdBeanObj2() {//method for id
		
    	Student std = new Student();
    	
    	std.setName("Mohit");
    	std.setRollno(105);
    	std.setEmail("Mohit@gmail.com");
    	
    	return std;
	}
}

