package in.sp.beans;

import org.springframework.core.style.ToStringCreator;


public class Address {// using setter method dependency injection

	private int houseno;
	
	private String city;
	
	private int pincode;

	public Address(int houseno, String city, int pincode) {
		
		this.houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	@Override
		public String toString() {//created tostring method because of this in.sp.beans.Address@654f0d9c since it is a object

			return "#"+houseno+", "+city+" - "+pincode;
		}
	
	
	
}
