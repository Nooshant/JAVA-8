package thakur.compar.pqueue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Employee  { //implements Comparable<Employee>
	 
    private Long id;
    private String name;
    private LocalDate dob;
 
    public Employee(Long id, String name, LocalDate dob) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
}

class EmployeeNameComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getName().hashCode() > o2.getName().hashCode())
		{
			return -1;
		}
		else if (o1.getName().hashCode() < o2.getName().hashCode()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		Comparator<Employee> nameSorter = Comparator.comparing(Employee::getName).reversed();//ascending order
		
		//PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(new EmployeeNameComparator()); // descending order
		PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(nameSorter);
        
		priorityQueue.add(new Employee(1l, "AAA", LocalDate.now()));
		priorityQueue.add(new Employee(4l, "CCC", LocalDate.now()));
		priorityQueue.add(new Employee(5l, "BBB", LocalDate.now()));
		priorityQueue.add(new Employee(2l, "FFF", LocalDate.now()));
		priorityQueue.add(new Employee(3l, "DDD", LocalDate.now()));
		priorityQueue.add(new Employee(6l, "EEE", LocalDate.now()));
		
		 
		while(true) 
		{
		    Employee e = priorityQueue.poll();
		    System.out.println(e);
		     
		    if(e == null) break;
		}
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1l, "AAA", LocalDate.now()));
		list.add(new Employee(4l, "CCC", LocalDate.now()));
		list.add(new Employee(5l, "BBB", LocalDate.now()));
		list.add(new Employee(2l, "FFF", LocalDate.now()));
		list.add(new Employee(3l, "DDD", LocalDate.now()));
		list.add(new Employee(6l, "EEE", LocalDate.now()));
		
		//It will throw classCastException since Employee class is not comparable
		list.stream().sorted().forEach(emp-> System.out.println(emp));
		
	}
}
