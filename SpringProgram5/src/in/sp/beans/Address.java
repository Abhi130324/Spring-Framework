package in.sp.beans;

import org.springframework.core.style.ToStringCreator;

import com.sun.org.apache.xml.internal.serializer.ToStream;

public class Address {// using setter method dependency injection

	private int houseno;
	
	private String city;
	
	private int pincode;

	public void setHouseno(int houseno) {
		System.out.println("Setter method houseno");
		this.houseno = houseno;
	}

	public int getHouseno() {
		return houseno;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setCity(String city) {
		System.out.println("Setter method city");
		this.city = city;
	}

	public void setPincode(int pincode) {
		System.out.println("Setter method pincode");
		this.pincode = pincode;
	}
	
	
	@Override
		public String toString() {//created tostring method because of this in.sp.beans.Address@654f0d9c since it is a object

			return "#"+houseno+", "+city+" - "+pincode;
		}
	
	
	
}
