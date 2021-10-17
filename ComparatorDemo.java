package com.thakur.comparatr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollno;
    String name, address;
  
    // Constructor
    public Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
  
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}


class SortByRoll implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollno - o2.rollno;
	}
}


class SortByName implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return  o2.name.compareTo(o1.name);
	}
}


public class ComparatorDemo {
	
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new SortByRoll());
  
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        
        
        Collections.sort(ar, new SortByName());
        
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
	}
}
