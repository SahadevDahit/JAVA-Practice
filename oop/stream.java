package oop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers=Arrays.asList(8,9,4,5,6,3,2);
		
		 numbers.stream().sorted().map(x->x*x).filter(x->x>5).collect(Collectors.toList()).forEach(System.out::println);
		  int sum = numbers.stream()
				  .map(x->x*x)
                  .filter(x -> x % 2 == 0)  // Keep even numbers
                  .filter(x -> x > 4)       // Keep numbers greater than 4
                  .reduce(0, (ans, i) -> ans + i); 
		  System.out.println(sum);
	}

}
