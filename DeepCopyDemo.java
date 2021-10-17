
class Department implements Cloneable {
    String empId; 
    String grade;
    String designation;
 
    public Department(String empId, String grade, String designation) {
        this.empId = empId; 
        this.grade = grade; 
        this.designation = designation;
    }
	
	protected Object clone() throws CloneNotSupportedException
	{
	  return super.clone();	
	}
}


class Employee implements Cloneable {
    int id;
    String name;
    Department dept;
 
    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
	
	protected Object clone() throws CloneNotSupportedException
	{
	   Department department = (Department)dept.clone();
	   Employee employee = (Employee) super.clone();
	   employee.dept= department;
	   return employee;
	}
}




public class DeepCopyDemo {

	public static void main(String[] args) {
		

	}

}
