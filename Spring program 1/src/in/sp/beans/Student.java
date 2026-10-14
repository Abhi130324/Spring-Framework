package in.sp.beans;
//pojo class
public class Student {

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void display() {
		System.out.println("Name: " +name);//write sysout ctrl spce for short
		System.out.println("Roll no: " +rollno);
		System.out.println("Email: " +email);
	}

	private String name;
	
	private int rollno;
	
	private String email;
	
}
