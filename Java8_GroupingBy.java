package basic.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author thakurde
 *
 */
public class Java8_GroupingBy {
	
	public static void main(String[] args) {
		List < Employee > employees = Arrays.asList(
				   new Employee(1, 10, "Chandra"), new Employee(1, 20, "Rajesh"),
				   new Employee(1, 30, "Rahul"), new Employee(1, 20, "Ramana"),  new Employee(1, 25, "Ramana"));
		
		
		Map<Integer, List<Employee>> groupByname = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		groupByname.forEach((k,v)->{
			System.out.print(k+" -> ");
			v.stream().forEach(val->{
				System.out.print(val+" ");
			});
			System.out.println();
		});
		
		Map<Integer,String> mobiles = new HashMap<>();
        mobiles.put(1, "iPhone 7");
        mobiles.put(2, "iPhone 6S");
        mobiles.put(3, "Samsung");
        mobiles.put(4, "1+");
        mobiles.put(5, "Samsung");
        
       List<String> list =  mobiles.entrySet().stream().filter(val -> val.getValue().equals("Samsung")).map(val -> val.getValue())
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		Map<Object, Object> deptMap = mobiles.entrySet()
			   .stream()
			   .filter(val -> val.getKey() > 2)
			   .collect(Collectors.toMap(val -> val.getKey(), val -> val.getValue()));
		 
		System.out.println(deptMap);
		
		
		Map<Integer, String> deptMap2 = mobiles.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        
        System.out.println("Filtering With Key : " + deptMap2);
	}
}





class Employee {
    private int id;
    private int department;
    private String name;

    public Employee(int id, int department, String name) {
        super();
        this.id = id;
        this.department = department;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public int getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", name=" + name + "]";
	}
}