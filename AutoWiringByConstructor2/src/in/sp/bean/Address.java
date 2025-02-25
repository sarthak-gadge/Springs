package in.sp.bean;

public class Address {
	
	private String City;
	private String State;

	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		City = city;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + "]";
	}
	
	

}
