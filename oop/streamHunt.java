package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList=new LinkedList<String>();
		myList.add("John");
		myList.add("Tonny");
		myList.add("Jack");
		myList.add("Yuup");
		myList.add("X-zero");
		myList.add("a-zero");
		
		Collections.sort(myList);
		
		// count the total items and it is in the long data type
		long length=myList.stream().count();
		
		// Sort string into the ascending
//	    myList.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
	    
	    // Sort string into the descending
//	    myList.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
	    
	    
		ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(98,67));
		nums.add(23);
		nums.add(78);
		nums.add(46);
		nums.add(39);
		nums.add(65);
		
		String[] array = {"John", "Tonny", "Jack", "Yuup", "X-zero"};
         Stream.of(array).forEach(System.out::println);
		
		
//	 List<Integer> filteredArray = nums.stream().map(x->x*2).filter(x->x>50).sorted((a,b)->a-b).collect(Collectors.toList());
//		
//		System.out.println(filteredArray);
//		
		
		Stream<Integer> stream = Stream.iterate(0, n -> n + 2);
//		  stream.limit(10).forEach(System.out::println); 
		  
//		  Stream<Double> stream1=Stream.generate(Math::random);
//		  stream.limit(5).forEach(System.out::println); 
		
		
		
		// Stream to generate the even values only
//		 Stream.iterate(0, x->x+1).limit(20).filter(x->x%2==0).forEach(System.out::println);
		

	}

}
