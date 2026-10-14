package in.sp.beans;

public class Student {

	private int rollno;
	
	private String name;
	
	private Address address;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		System.out.println("Setter method Rollno");
		return rollno;
	}

	public String getName() {
		System.out.println("Setter method name");
		return name;
	}

	public Address getAddress() {
		System.out.println("Setter method address");
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
	
	
}
