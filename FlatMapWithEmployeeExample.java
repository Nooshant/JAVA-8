package intermediate.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Address {
	String homeAddress;
	String officeAddress;

	Address(String homeAddress, String officeAddress) {
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
}

class Employee {
	int id;
	String name;
	Address add;

	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
}

public class FlatMapWithEmployeeExample {

	public static void main(String[] args) {

		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(1, "deepak", new Address("btm", "jaynagar")));
		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(2, "thakur", new Address("marathahalli", "Whitefield")));
		List<List<Employee>> list = new ArrayList<List<Employee>>();
		list.add(list1);
		list.add(list2);
		List<Employee> empList = list.stream().flatMap(l-> l.stream()).collect(Collectors.toList());
		System.out.println(empList);
	}
}
