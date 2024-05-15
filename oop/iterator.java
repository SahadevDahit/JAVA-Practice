package oop;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");

		    // Get the iterator
		    Iterator<String> it = cars.iterator();

		    // Print the first item
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    	
		    }
		    
	}

}
