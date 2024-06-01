package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + "]";
    }

}
public class comparatorSort {
	public static void main(String[] args) {
		  Student s1 = new Student("hunk", 32);
	        Student s2 = new Student("love", 20);
	        Student s3 = new Student("chris", 25);
	        Student s4 = new Student("brown", 35);

	        // Create a list of students
	        List<Student> students = new ArrayList<>();
	        students.add(s1);
	        students.add(s2);
	        students.add(s3);
	        students.add(s4);

	        // Define a comparator for sorting students by name
	        Comparator<Student> nameComparator = new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return s1.name.compareTo(s2.name);
//	                return s1.rollNo-(s2.rollNo);
	            }
	        };

	        // Sort the list using the comparator
	        Collections.sort(students, nameComparator);

	        // Print the sorted list
	        for (Student student : students) {
	            System.out.println(student);
	        }

	
	}

}
