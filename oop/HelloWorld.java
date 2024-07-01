package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class Staff{
	String name;
	int id;
	Staff(String name, int id){
		this.name=name;
		this.id=id;
	}
	public void display() {
		System.out.println("This is awsome from parent");
	}
}
class child2 extends Staff{

	child2(String name, int id) {
		super(name, id);
		this.name=name;
		this.id=id;
		// TODO Auto-generated constructor stub
	}

}



public class HelloWorld{	
  
   	  public static void main(String[] args) {
   		Staff s=new Staff("dahit",24);
   		Staff s1=new Staff("anuj",23);
   		Staff s2=new Staff("ruffic",33);
   		Staff s3=new Staff("suman",18);
   		 
   		 List<Staff> myList=new ArrayList<Staff>();
   		 myList.add(s);
   		 myList.add(s1);
   		 myList.add(s2);
   		 myList.add(s3);
   		 
   		  Comparator<Staff> sortedStaff=new Comparator<Staff>() {

			@Override
			public int compare(Staff o1, Staff o2) {
				// TODO Auto-generated method stub
//				return o1.name.compareTo(o2.name);
				return o1.id-o2.id;
			}
   			  
   		  };
   		  
   		  Collections.sort(myList,sortedStaff);
   		  
   		for(Staff staff:myList) {
   			System.out.println(staff.id);
   		}
   		
	  }

	
}
