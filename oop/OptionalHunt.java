package oop;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> name=getName(2);
		String nameTobeUsed;
		
//		nameTobeUsed=name.isPresent()?name.get():"NA";
//		nameTobeUsed=name.orElse("NA"); // handling false case
//		nameTobeUsed=name.orElseGet(()->"NA"); // lambda function
		nameTobeUsed=name.orElseThrow(NoSuchElementException::new); // throwing the error
	
		System.out.println(nameTobeUsed);
		
//		if(name.isPresent()) {
//			System.out.println(name.get());
//		}
		
		
//		name.ifPresent(System.out::println);
		
		
	}

	private static Optional<String> getName(int i) {
		// TODO Auto-generated method stub
		String name="hunk";
		
//		return Optional.ofNullable(name); // handling the string along with null values
		return Optional.empty();  // sending the empty value
//		return Optional.of("knuh"); 
	}

}
