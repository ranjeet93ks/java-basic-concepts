package com.basic.concepts.collections;

//Java Program to demonstrate the use of Java Comparator  
import java.util.*;
import com.basic.concepts.model.Student;

public class ComparatorExample {
	public static void main(String args[]) {
//Creating a list of students  
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");
//Using NameComparator to sort the elements  
		Collections.sort(al, new NameComparator());
//Traversing the elements of list  
		for (Student st : al) {
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}
		System.out.println("----->>>>....");

		System.out.println("sorting by Age");
//Using AgeComparator to sort the elements  
		Collections.sort(al, new AgeComparator());
//Travering the list again  
		for (Student st : al) {
			System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
		}

	}
}

class AgeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getAge() == s2.getAge())
			return 0;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}
