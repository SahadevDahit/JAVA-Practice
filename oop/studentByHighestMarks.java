package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
	String name;
	int age, marks;
	public Student1(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class studentByHighestMarks{
	public static void main(String[] args) {
		
		Student1 s= new Student1("sahadev",23,57);
		Student1 s1= new Student1("dahit",43,23);
		Student1 s2= new Student1("hunk",20,35);
		List<Student1> studentList=new ArrayList<Student1>();
		studentList.add(s);
		studentList.add(s1);
		studentList.add(s2);
		
		
		Comparator<Student1> nameComparator=new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		};
		
		Collections.sort(studentList,nameComparator);
		studentList.stream().forEach(e->System.out.println(e));
		
		
		
		
		
	}
}
