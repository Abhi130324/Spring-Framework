package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	
	public static void main(String[] args) {//ctrl + space
		
		String config_loc = "in/sp/resources/applicationContext.xml";//we paste this config_loc in context to start the container
		ApplicationContext  context = new ClassPathXmlApplicationContext(config_loc);//through this we load spring configuration file
		
	   Student std =(Student) context.getBean("stdId");//since get bean return value in object so we type cast it
	   std.display();
	   
	   
	   System.out.println("-------------------");
	   
	   
	   Student std2 =(Student) context.getBean("stdId2");//we create 2nd object
	   std2.display();
	   
	   
	   System.out.println("-------------------");
	   
	   
	   Student std3 =(Student) context.getBean("stdId3");//we create 2nd object
	   std3.display();
	   
	   
	   
	   
	}

}
