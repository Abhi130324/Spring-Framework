package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	
	public static void main(String[] args) {
		String config_file_loc = "in/sp/resources/applicationContext.xml";//this prt is imp
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		
		
		
	Student std = (Student) context.getBean("new1");//sometimes if the error is coming try changing the id name
		std.display();
	}
}
