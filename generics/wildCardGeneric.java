package generics;

import java.util.ArrayList;
import java.util.List;

public class wildCardGeneric {
	 public static void printList(List<?> list) {          // Unbounded wild card
	        for (Object obj : list) {
	            System.out.println(obj);
	        }
	    }
	 public static double sumOfList(List<? extends Number> list) { // upper bound wild card
	        double sum = 0.0;
	        for (Number num : list) {
	            sum += num.doubleValue();
	        }
	        return sum;
	    }
	 public static void addNumbers(List<? super Integer> list) {  // lower bound wild card
	        for (int i = 1; i <= 5; i++) {
	            list.add(i);
	        }
	 }
	        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    List<String> stringList = List.of("one", "two", "three");
	        List<Integer> integerList = List.of(1, 2, 3);
	        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
	        
	        List<Number> numberList = new ArrayList<>();
	        addNumbers(numberList);
	        
	        System.out.println("Number list after adding integers: " + numberList);
	        System.out.println("Printing string list:");
	        printList(stringList);

	        System.out.println("Printing integer list:");
	        printList(integerList);
	        
	        System.out.println("Sum of integer list: " + sumOfList(integerList));
	        System.out.println("Sum of double list: " + sumOfList(doubleList));
	}

}
