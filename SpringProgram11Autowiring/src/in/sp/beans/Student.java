package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	
	private int rollno;
	
	@Autowired //This automatically inject the object 
	@Qualifier("createAddressObj2")
	private Address address;
	
//	@Autowired//this will help to get value automatically
//	private Subjects subjects;//for new subjects
////
//	public Subjects getSubjects() {
//		return subjects;
//	}
//
//	public void setSubjects(Subjects subjects) {
//		this.subjects = subjects;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	

	
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("RollNo: " +rollno);
		System.out.println("Address: " +address);//manual DI
		//System.out.println("Subjects: " +subjects);//this is also manual dependency injection
	}

	
}
