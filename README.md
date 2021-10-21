# JAVA-8

```
public class TestDemo {
  public static void main(String[] args) {
	  
	  List<Student> list= new ArrayList<>();
	  list.add(new Student(1,"A","abc",10.5f));
	  list.add(new Student(1,"F","ffg",90.5f));
	  list.add(new Student(1,"B","def",89.5f));
	  list.add(new Student(1,"E","fgh",65.5f));
	  list.add(new Student(1,"E","fgh",65.5f));
	  list.add(new Student(1,"E","fgh",65.5f));
	  list.add(new Student(1,"E","fgh",65.5f));
   
    // For each department, get the all the score made
		Map<String, Double> map = list.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.summingDouble(Student::getScore)));
		
		map.forEach((k,v)->{
			System.out.println(k+"  "+v);
		});
  }
}
*******Result***********
abc  10.5
def  89.5
fgh  262.0
ffg  90.5
```

- Each department -> total count
`collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))`
