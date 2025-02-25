package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollNo;
	private String name;
	private Address address;

	public Student() {
		super();
	}

	@Autowired // Constructor Autowiring
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("ROLLNo: "+rollNo);
		System.out.println("NAME: "+name);
		System.out.println("Address: "+address);
	}

}
