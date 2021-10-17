package com.thakur.immutble;

final class Employee {

	private final String empName;
	private final int age;
	private final Address address;

	public Employee(String name, int age, Address address) {
		super();
		this.empName = name;
		this.age = age;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	//deep clone of Address object
	public Address getAddress() throws CloneNotSupportedException {
		//return (Address) address.clone();
		
//		Address add = new Address();
//		add.setAddress(this.address.getAddress());
//		add.setAddressType(this.address.getAddressType());
//		add.setCity(this.address.getAddress());
		
		return address.copyOfAddress(this.address);
	}
}

//class Address implements Cloneable {
	class Address {

	public String addressType;
	public String address;
	public String city;

	
	public Address() {
		super();
	}

	public Address copyOfAddress(Address addr)
	{
		Address add = new Address();
		add.setAddress(addr.getAddress());
		add.setAddressType(addr.getAddressType());
		add.setCity(addr.getAddress());
		return add;
	}
	
	public Address(String addressType, String address, String city) {
		super();
		this.addressType = addressType;
		this.address = address;
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	@Override
	public String toString() {
		return "Address Type - " + addressType + ", address - " + address + ", city - " + city;
	}
}

public class ImmutableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Mahesh", 34, new Address("Home", "JP Nagar", "Bangalore"));
		  
        Address address = emp.getAddress();

        System.out.println(address);

        address.setAddress("Jayanagar");
        address.setAddressType("Office");
        address.setCity("Sangli");

        System.out.println(emp.getAddress());

	}

}
