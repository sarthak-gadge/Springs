package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private int rollNo;
	private String name;
	
	@Autowired
	@Qualifier("createAddrObj2")
	private Address address; //Automatically inject the Address bean.

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void display() {
		System.out.println("ROLLNO: "+rollNo);
		System.out.println("NAme: "+name);
		System.out.println("Address: "+address);
	}
	
	
	
	

}
